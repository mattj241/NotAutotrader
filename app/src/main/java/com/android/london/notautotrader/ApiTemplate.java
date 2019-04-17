package com.android.london.notautotrader;

import com.android.london.notautotrader.Models.BaseModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiTemplate {

    @GET("search?")
    Call<BaseModel> GetResults(@Query("api_key") String api,
                                     @Query("year") String year,
                                     @Query("make") String make,
                                     @Query("model") String model,
                                     @Query("zip") String zip,
                                     @Query("radius") Integer radius);
}
