package com.android.london.notautotrader;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.london.notautotrader.Models.BaseModel;

import java.util.List;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    Button testBtn;
    Context context;
    static MainActivity mainActivity;
    static BaseModel baseQueryResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        mainActivity = this;
        setContentView(R.layout.activity_main);
        testBtn = findViewById(R.id.button);
        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApiTemplate api = RetroFitClient.getClient().create(ApiTemplate.class);
                api.GetResults("5ZWbDJVqHfDSReviXSOMyPpW1wQhYo2Z", "2015", "Ford", "Edge", "48176", 10).enqueue(new Callback<BaseModel>() {
                    @Override
                    public void onResponse(Call<BaseModel> call, Response<BaseModel>response) {
                        if(response.isSuccessful()){
                            baseQueryResults = response.body();
                            startActivity(new Intent(context, ResultList.class));
                        }
                    }

                    @Override
                    public void onFailure(Call<BaseModel> call, Throwable t) {

                    }
                });
            }
        });
    }

    public static BaseModel getQueryResults(){
        return baseQueryResults;
    }
}
