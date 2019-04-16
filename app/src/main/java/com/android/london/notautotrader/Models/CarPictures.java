package com.android.london.notautotrader.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CarPictures {

    @SerializedName("photo_links")
    @Expose
    private List<String> photoLinks;
}
