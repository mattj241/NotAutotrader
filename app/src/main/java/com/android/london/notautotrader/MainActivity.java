package com.android.london.notautotrader;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;

import com.android.london.notautotrader.Models.BaseModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiTemplate api = RetroFitClient.getClient().create(ApiTemplate.class);
        api.GetTasks("5ZWbDJVqHfDSReviXSOMyPpW1wQhYo2Z", "2019", "Ford", "Edge").enqueue(new Callback<List<BaseModel>>() {
            @Override
            public void onResponse(Call<List<BaseModel>> call, Response<List<BaseModel>> response) {
                if(response.isSuccessful()){
                    Log.d("test", response.body().get(0).getCar().get(0).getColor());
                }
            }

            @Override
            public void onFailure(Call<List<BaseModel>> call, Throwable t) {

            }
        });
    }
}
