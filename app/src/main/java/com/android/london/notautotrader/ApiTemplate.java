package com.android.london.notautotrader;

import com.android.london.notautotrader.Models.BaseModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiTemplate {

    @GET
    Call<List<BaseModel>> GetTasks();
}
