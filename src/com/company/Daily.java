package com.company;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Daily {

    @SerializedName("dt")
    @Expose
    private long dt;
    @SerializedName("sunrise")
    @Expose
    private double sunrise;
    @SerializedName("sunset")
    @Expose
    private double sunset;
    @SerializedName("moonrise")
    @Expose
    private double moonrise;
    @SerializedName("moonset")
    @Expose
    private double moonset;
    @SerializedName("moon_phase")
    @Expose
    private double moonPhase;
    @SerializedName("temp")
    @Expose
    private Temp temp;
    @SerializedName("feels_like")
    @Expose
    private FeelsLike feelsLike;
    @SerializedName("pressure")
    @Expose
    private double pressure;
    @SerializedName("humidity")
    @Expose
    private double humidity;
    @SerializedName("dew_point")
    @Expose
    private double dewPoint;
    @SerializedName("wind_speed")
    @Expose
    private double windSpeed;
    @SerializedName("wind_deg")
    @Expose
    private double windDeg;
    @SerializedName("wind_gust")
    @Expose
    private double windGust;
    @SerializedName("weather")
    @Expose
    private List<Weather> weather = null;
    @SerializedName("clouds")
    @Expose
    private double clouds;
    @SerializedName("pop")
    @Expose
    private double pop;
    @SerializedName("rain")
    @Expose
    private double rain;
    @SerializedName("snow")
    @Expose
    private double snow;
    @SerializedName("uvi")
    @Expose
    private double uvi;

    /**
     * No args constructor for use in serialization
     *
     */
    public Daily() {
    }

    /**
     *
     * @param moonset
     * @param rain
     * @param sunrise
     * @param temp
     * @param windGust
     * @param uvi
     * @param moonrise
     * @param pressure
     * @param clouds
     * @param dewPoint
     * @param dt
     * @param feelsLike
     * @param windDeg
     * @param pop
     * @param snow
     * @param sunset
     * @param weather
     * @param humidity
     * @param moonPhase
     * @param windSpeed
     */
    public Daily(long dt, double sunrise, double sunset, double moonrise, double moonset, double moonPhase, Temp temp, FeelsLike feelsLike, double pressure, double humidity, double dewPoint, double windSpeed, double windDeg, double windGust, List<Weather> weather, double clouds, double pop, double rain, double snow, double uvi) {
        super();
        this.dt = dt;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.moonrise = moonrise;
        this.moonset = moonset;
        this.moonPhase = moonPhase;
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dewPoint = dewPoint;
        this.windSpeed = windSpeed;
        this.windDeg = windDeg;
        this.windGust = windGust;
        this.weather = weather;
        this.clouds = clouds;
        this.pop = pop;
        this.rain = rain;
        this.snow = snow;
        this.uvi = uvi;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public Daily withDt(long dt) {
        this.dt = dt;
        return this;
    }

    public double getSunrise() {
        return sunrise;
    }

    public void setSunrise(double sunrise) {
        this.sunrise = sunrise;
    }

    public Daily withSunrise(double sunrise) {
        this.sunrise = sunrise;
        return this;
    }

    public double getSunset() {
        return sunset;
    }

    public void setSunset(double sunset) {
        this.sunset = sunset;
    }

    public Daily withSunset(double sunset) {
        this.sunset = sunset;
        return this;
    }

    public double getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(double moonrise) {
        this.moonrise = moonrise;
    }

    public Daily withMoonrise(double moonrise) {
        this.moonrise = moonrise;
        return this;
    }

    public double getMoonset() {
        return moonset;
    }

    public void setMoonset(double moonset) {
        this.moonset = moonset;
    }

    public Daily withMoonset(double moonset) {
        this.moonset = moonset;
        return this;
    }

    public double getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(double moonPhase) {
        this.moonPhase = moonPhase;
    }

    public Daily withMoonPhase(double moonPhase) {
        this.moonPhase = moonPhase;
        return this;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public Daily withTemp(Temp temp) {
        this.temp = temp;
        return this;
    }

    public FeelsLike getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(FeelsLike feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Daily withFeelsLike(FeelsLike feelsLike) {
        this.feelsLike = feelsLike;
        return this;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public Daily withPressure(double pressure) {
        this.pressure = pressure;
        return this;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public Daily withHumidity(double humidity) {
        this.humidity = humidity;
        return this;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public Daily withDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
        return this;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Daily withWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public double getWindDeg() {
        return windDeg;
    }

    public void setWindDeg(double windDeg) {
        this.windDeg = windDeg;
    }

    public Daily withWindDeg(double windDeg) {
        this.windDeg = windDeg;
        return this;
    }

    public double getWindGust() {
        return windGust;
    }

    public void setWindGust(double windGust) {
        this.windGust = windGust;
    }

    public Daily withWindGust(double windGust) {
        this.windGust = windGust;
        return this;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Daily withWeather(List<Weather> weather) {
        this.weather = weather;
        return this;
    }

    public double getClouds() {
        return clouds;
    }

    public void setClouds(double clouds) {
        this.clouds = clouds;
    }

    public Daily withClouds(double clouds) {
        this.clouds = clouds;
        return this;
    }

    public double getPop() {
        return pop;
    }

    public void setPop(double pop) {
        this.pop = pop;
    }

    public Daily withPop(int pop) {
        this.pop = pop;
        return this;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public Daily withRain(double rain) {
        this.rain = rain;
        return this;
    }

    public double getSnow() {
        return snow;
    }

    public void setSnow(double snow) {
        this.snow = snow;
    }

    public Daily withSnow(double snow) {
        this.snow = snow;
        return this;
    }

    public double getUvi() {
        return uvi;
    }

    public void setUvi(double uvi) {
        this.uvi = uvi;
    }

    public Daily withUvi(double uvi) {
        this.uvi = uvi;
        return this;
    }

}
