package com.android.london.notautotrader.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.os.Bundle;

import com.android.london.notautotrader.Fragments.WelcomeFragment;
import com.android.london.notautotrader.R;

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
