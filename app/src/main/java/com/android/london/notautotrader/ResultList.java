package com.android.london.notautotrader;

import android.content.Context;
import android.os.Bundle;

import com.android.london.notautotrader.Models.BaseModel;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResultList extends AppCompatActivity {
    private BaseModel mainResultObj;
    private RecyclerView recyclerView;
    private TaskAdapter taskAdapter;
    Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        mainResultObj = MainActivity.mainActivity.getQueryResults();
        context = this;
        configurePageFunctionality();
    }

    public void configurePageFunctionality(){
        recyclerView = findViewById(R.id.mainRecycleView);
        taskAdapter = new TaskAdapter(mainResultObj.getListings(), context);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(taskAdapter);
        taskAdapter.notifyDataSetChanged();
    }

}
