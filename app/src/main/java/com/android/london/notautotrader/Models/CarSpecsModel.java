package com.android.london.notautotrader.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CarSpecsModel {

    @SerializedName("year")
    @Expose
    private int year;

    @SerializedName("make")
    @Expose
    private String make;

    @SerializedName("model")
    @Expose
    private String model;

    @SerializedName("trim")
    @Expose
    private String trim;

    @SerializedName("drivetrain")
    @Expose
    private String drivetrain;

    @SerializedName("engine")
    @Expose
    private String engine;

    @SerializedName("body_type")
    @Expose
    private String bodyType;
}
