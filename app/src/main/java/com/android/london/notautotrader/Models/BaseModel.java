package com.android.london.notautotrader.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BaseModel {

    @SerializedName("num_found")
    @Expose
    int numberOfResults;

    @SerializedName("listings")
    @Expose
    List<CarListingModel> car;
}
