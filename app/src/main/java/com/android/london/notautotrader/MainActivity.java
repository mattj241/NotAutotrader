package com.android.london.notautotrader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.london.notautotrader.Fragments.WelcomeFragment;
import com.android.london.notautotrader.Models.BaseModel;

import java.util.List;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    Context context;
    static MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        mainActivity = this;
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.fragmentLayout, new WelcomeFragment())
                .commit();

    }
}
