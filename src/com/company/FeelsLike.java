package com.company;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeelsLike {

    @SerializedName("day")
    @Expose
    private double day;
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
    public FeelsLike() {
    }

    /**
     *
     * @param eve
     * @param night
     * @param day
     * @param morn
     */
    public FeelsLike(double day, double night, double eve, double morn) {
        super();
        this.day = day;
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

    public FeelsLike withDay(double day) {
        this.day = day;
        return this;
    }

    public double getNight() {
        return night;
    }

    public void setNight(double night) {
        this.night = night;
    }

    public FeelsLike withNight(double night) {
        this.night = night;
        return this;
    }

    public double getEve() {
        return eve;
    }

    public void setEve(double eve) {
        this.eve = eve;
    }

    public FeelsLike withEve(double eve) {
        this.eve = eve;
        return this;
    }

    public double getMorn() {
        return morn;
    }

    public void setMorn(double morn) {
        this.morn = morn;
    }

    public FeelsLike withMorn(double morn) {
        this.morn = morn;
        return this;
    }

}
