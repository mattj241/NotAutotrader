package com.android.london.notautotrader.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.london.notautotrader.Models.Listing;
import com.android.london.notautotrader.R;
import com.android.london.notautotrader.SimpleWebView;
import com.android.london.notautotrader.ViewPagerAdapter;
import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.google.gson.Gson;

import java.util.HashMap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class DetailedView extends AppCompatActivity {

    private SliderLayout mDemoSlider;
    private TextView Header;
    Button urlBtn;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        String jsonMyObject = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            jsonMyObject = extras.getString("listing");
        }
        final Listing myListing = new Gson().fromJson(jsonMyObject, Listing.class);

        ViewPager viewPager = findViewById(R.id.imageSlider);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this,
                myListing.getMedia().getPhotoLinks());
        viewPager.setAdapter(adapter);

        context = this;
        Header = findViewById(R.id.detailedHeader);
        Header.setText(myListing.getHeading());
        urlBtn = findViewById(R.id.urlBtn);
        urlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SimpleWebView.class);
                intent.putExtra("linkto", myListing.getVdpUrl());
                startActivity(intent);
            }
        });
    }
}

