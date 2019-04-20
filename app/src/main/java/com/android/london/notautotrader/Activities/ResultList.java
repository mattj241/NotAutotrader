package com.android.london.notautotrader.Activities;

import android.content.Context;
import android.os.Bundle;

import com.android.london.notautotrader.Fragments.SimpleQueryFragment;
import com.android.london.notautotrader.Models.BaseModel;
import com.android.london.notautotrader.R;
import com.android.london.notautotrader.TaskAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ResultList extends AppCompatActivity {
    private BaseModel resultObj;
    private RecyclerView recyclerView;
    private TaskAdapter taskAdapter;
    Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        resultObj = SimpleQueryFragment.getQueryResults();
        context = this;
        configurePageFunctionality();
    }

    public void configurePageFunctionality(){
        recyclerView = findViewById(R.id.mainRecycleView);
        taskAdapter = new TaskAdapter(resultObj.getListings(), context);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(taskAdapter);
        taskAdapter.notifyDataSetChanged();
    }

}
