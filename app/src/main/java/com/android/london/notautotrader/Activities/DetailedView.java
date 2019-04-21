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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import retrofit2.http.Body;

public class DetailedView extends AppCompatActivity {

    private SliderLayout mDemoSlider;
    private TextView Header, Price, Miles, Exterior, Interior, Bodytype, Drivetrain, Engine;
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
        List<String> PhotoLinks = myListing.getMedia().getPhotoLinks();
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, PhotoLinks);
        viewPager.setAdapter(adapter);

        context = this;
        Header = findViewById(R.id.detailedHeader);
        Header.setText(myListing.getHeading());
        Price = findViewById(R.id.placeholder_price);
        Miles = findViewById(R.id.placeholder_miles);
        String formattedPrice;

        if (myListing.getPrice() == null){
            formattedPrice = "Unlisted Price";
        }
        else{
            formattedPrice = myListing.getPrice().toString();
            if (formattedPrice.contains(".0")){
                formattedPrice = formattedPrice.replace(".0", "");
                formattedPrice = "$"+formattedPrice;
            }
            Price.setText(formattedPrice);
            try
            {
                String formattedMiles = myListing.getMiles().toString();
                if (formattedMiles.contains(".0")){
                    formattedMiles = formattedMiles.replace(".0", "");
                }
                formattedMiles += " miles";
                Miles.setText(formattedMiles);
            }
            catch ( NullPointerException e ){
                Miles.setText("No miles!");
            }
        }

        Exterior = findViewById(R.id.placeholder_ExteriorColor);
        String extColor = myListing.getExteriorColor();
        if (extColor == null){
            Exterior.setText(getString(R.string.unlistedExterior));
        }
        else {
            Exterior.setText(getString(R.string.exterior, extColor));
        }

        Interior = findViewById(R.id.placeholder_InteriorColor);
        String intColor = myListing.getInteriorColor();
        if (intColor == null){
            Interior.setText(getString(R.string.unlistedInterior));
        }
        else {
            Interior.setText(getString(R.string.interior, intColor));
        }

        Bodytype = findViewById(R.id.placeholder_bodyType);
        String bodyType = myListing.getBuild().getBodyType();
        if (bodyType == null){
            Bodytype.setText(getString(R.string.unlistedBodytype));
        }
        else {
            Bodytype.setText(getString(R.string.body, bodyType));
        }

        Drivetrain = findViewById(R.id.placeholder_drivetrain);
        //Drivetrain.setText("Drivetrain: "+ myListing.getBuild().getDrivetrain());
        String drivetrain = myListing.getBuild().getDrivetrain();
        if (drivetrain == null){
            Drivetrain.setText(getString(R.string.unlistedDrivetrain));
        }
        else {
            Drivetrain.setText(getString(R.string.drivetrain, drivetrain));
        }

        Engine = findViewById(R.id.placeholder_engine);
        String engine = myListing.getBuild().getEngine();
        if (engine == null){
            Engine.setText(getString(R.string.unlistedEngine));
        }
        else {
            Engine.setText(getString(R.string.engine, engine));
        }

        urlBtn = findViewById(R.id.urlBtn);
        urlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SimpleWebView.class);
                intent.putExtra("linkTo", myListing.getVdpUrl())
                        .putExtra("listing", new Gson().toJson(myListing));
                startActivity(intent);
            }
        });
    }
}

