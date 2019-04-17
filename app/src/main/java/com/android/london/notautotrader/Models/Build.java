package com.android.london.notautotrader.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Build {

    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("make")
    @Expose
    private String make;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("trim")
    @Expose
    private String trim;
    @SerializedName("short_trim")
    @Expose
    private String shortTrim;
    @SerializedName("body_type")
    @Expose
    private String bodyType;
    @SerializedName("vehicle_type")
    @Expose
    private String vehicleType;
    @SerializedName("drivetrain")
    @Expose
    private String drivetrain;
    @SerializedName("fuel_type")
    @Expose
    private String fuelType;
    @SerializedName("engine")
    @Expose
    private String engine;
    @SerializedName("engine_size")
    @Expose
    private Double engineSize;
    @SerializedName("doors")
    @Expose
    private Integer doors;
    @SerializedName("cylinders")
    @Expose
    private Integer cylinders;
    @SerializedName("made_in")
    @Expose
    private String madeIn;
    @SerializedName("trim_r")
    @Expose
    private String trimR;
    @SerializedName("highway_miles")
    @Expose
    private String highwayMiles;
    @SerializedName("city_miles")
    @Expose
    private String cityMiles;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getShortTrim() {
        return shortTrim;
    }

    public void setShortTrim(String shortTrim) {
        this.shortTrim = shortTrim;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDrivetrain() {
        return drivetrain;
    }

    public void setDrivetrain(String drivetrain) {
        this.drivetrain = drivetrain;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(Double engineSize) {
        this.engineSize = engineSize;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Integer getCylinders() {
        return cylinders;
    }

    public void setCylinders(Integer cylinders) {
        this.cylinders = cylinders;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getTrimR() {
        return trimR;
    }

    public void setTrimR(String trimR) {
        this.trimR = trimR;
    }

    public String getHighwayMiles() {
        return highwayMiles;
    }

    public void setHighwayMiles(String highwayMiles) {
        this.highwayMiles = highwayMiles;
    }

    public String getCityMiles() {
        return cityMiles;
    }

    public void setCityMiles(String cityMiles) {
        this.cityMiles = cityMiles;
    }

}
