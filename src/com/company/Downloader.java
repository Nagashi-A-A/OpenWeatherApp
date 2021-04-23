package com.company;
import com.google.gson.*;
import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class Downloader implements Runnable{
    String link;

    Example requestResult = new Example();

    public Downloader(String link){
        this.link = link;
    }

    @Override
    public void run() {
        try{

            URL url = new URL(link);
            StringBuilder jsonString = new StringBuilder();

            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            BufferedInputStream in = new BufferedInputStream(http.getInputStream());
            BufferedReader myReader = new BufferedReader(new InputStreamReader(in));
            String currentLine;
            while((currentLine = myReader.readLine()) != null){
                jsonString.append(currentLine);
            }
            String resultString = jsonString.toString();
            GsonBuilder builder = new GsonBuilder();
            Gson g = builder.create();

            requestResult = g.fromJson(resultString, Example.class);

            in.close();
            DataProcessing(requestResult);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private void DataProcessing(Example dataEx)
    {
        StringBuilder resultData = new StringBuilder();
        resultData.append("City: " + dataEx.getTimezone() + " \n");
        resultData.append("Latitude: " + dataEx.getLat() + "\n");
        resultData.append("Longitude: " + dataEx.getLon() + "\n");
        resultData.append("Highest pressure in five days: " + PressureCheck(dataEx.getDaily()) + "\n");
        resultData.append("Day with lowest difference in Night and Morning temperature: " + DateWithLowestTempDif(dataEx.getDaily()));
        System.out.println(resultData);
    }

    private double PressureCheck(List<Daily> daily)
    {
        double highestPressure = 0;

        for(int i = 0; i < 5; i++)
        {
            if(daily.get(i).getPressure() > highestPressure)
            {
                highestPressure = daily.get(i).getPressure();
            }
        }

        return highestPressure;
    }

    private String DateWithLowestTempDif(List<Daily> daily)
    {
        long unixDate = 0;
        String dataResult = "";
        for(int i = 0; i < 4; i++)
        {
            if(CompareTemp(daily.get(i).getTemp(), daily.get(i+1).getTemp()))
            {
                unixDate = daily.get(i).getDt();
            }
            else
            {
                unixDate = daily.get(i+1).getDt();
            }
        }

        dataResult = DateFromUnixFormat(unixDate);
        return  dataResult;
    }

    public static String DateFromUnixFormat(long unixData)
    {
        String returnDate = "";
        Date date = new Date(unixData*1000L);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+3"));
        returnDate = dateFormat.format(date);

        return returnDate;
    }

    private boolean CompareTemp(Temp t1, Temp t2)
    {
        boolean lessThen;
        double diffT1 = t1.getNight() - t1.getMorn();
        double diffT2 = t2.getNight() - t2.getMorn();
        if(diffT1 < diffT2)
        {
            lessThen = true;
        }
        else
            lessThen = false;

        return lessThen;
    }
}
