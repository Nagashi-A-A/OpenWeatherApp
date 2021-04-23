package com.company;


public class Main {

    public static void main(String[] args) {

        //String for url request in JSON format
        String urlOpenWeatherApi = "https://api.openweathermap.org/data/2.5/onecall?lat=55.761665&lon=37.606667&units=metric&exclude=current,minutely,hourly,alerts&appid=be0e0e9152a18104fcb04ada4e191089";
        Downloader d = new Downloader(urlOpenWeatherApi);
        d.run();

    }
}
