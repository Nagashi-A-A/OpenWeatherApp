package com.company;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Temp {

    @SerializedName("day")
    @Expose
    private double day;
    @SerializedName("min")
    @Expose
    private double min;
    @SerializedName("max")
    @Expose
    private double max;
    @SerializedName("night")
    @Expose
    private double night;
    @SerializedName("eve")
    @Expose
    private double eve;
    @SerializedName("morn")
    @Expose
    private double morn;

    /**
     * No args constructor for use in serialization
     *
     */
    public Temp() {
    }

    /**
     *
     * @param min
     * @param max
     * @param eve
     * @param night
     * @param day
     * @param morn
     */
    public Temp(double day, double min, double max, double night, double eve, double morn) {
        super();
        this.day = day;
        this.min = min;
        this.max = max;
        this.night = night;
        this.eve = eve;
        this.morn = morn;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public Temp withDay(double day) {
        this.day = day;
        return this;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public Temp withMin(double min) {
        this.min = min;
        return this;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public Temp withMax(double max) {
        this.max = max;
        return this;
    }

    public double getNight() {
        return night;
    }

    public void setNight(double night) {
        this.night = night;
    }

    public Temp withNight(double night) {
        this.night = night;
        return this;
    }

    public double getEve() {
        return eve;
    }

    public void setEve(double eve) {
        this.eve = eve;
    }

    public Temp withEve(double eve) {
        this.eve = eve;
        return this;
    }

    public double getMorn() {
        return morn;
    }

    public void setMorn(double morn) {
        this.morn = morn;
    }

    public Temp withMorn(double morn) {
        this.morn = morn;
        return this;
    }

}
