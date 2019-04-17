package com.android.london.notautotrader;

import com.android.london.notautotrader.Models.BaseModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiTemplate {

    @GET("search?")
    Call<List<BaseModel>> GetTasks(@Query("api_key") String api, @Query("year") String year, @Query("make") String make, @Query("model") String model);
}
