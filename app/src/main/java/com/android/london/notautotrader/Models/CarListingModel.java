package com.android.london.notautotrader.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CarListingModel {

    @SerializedName("vin")
    @Expose
    private String vin;

    @SerializedName("heading")
    @Expose
    private String title;

    @SerializedName("price")
    @Expose
    private int salePrice;

    @SerializedName("msrp")
    @Expose
    private int msrpPrice;

    @SerializedName("vdp_url")
    @Expose
    private String listingUrl;

    @SerializedName("exterior_color")
    @Expose
    private String color;

    @SerializedName("media")
    @Expose
    private List<CarPictures> pictures;

    @SerializedName("build")
    @Expose
    private List<CarSpecsModel> specs;

    public String getVin() {
        return vin;
    }

    public String getTitle() {
        return title;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public int getMsrpPrice() {
        return msrpPrice;
    }

    public String getListingUrl() {
        return listingUrl;
    }

    public String getColor() {
        return color;
    }

    public List<CarPictures> getPictures() {
        return pictures;
    }

    public List<CarSpecsModel> getSpecs() {
        return specs;
    }
}
