package com.android.london.notautotrader.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.london.notautotrader.Networking.ApiTemplate;
import com.android.london.notautotrader.CarData;
import com.android.london.notautotrader.Models.BaseModel;
import com.android.london.notautotrader.R;
import com.android.london.notautotrader.Activities.ResultList;
import com.android.london.notautotrader.Networking.RetroFitClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SimpleQueryFragment extends Fragment {

    private Spinner makeSpinner, modelSpinner;
    private RadioButton newBtn, usedBtn;
    private Button queryBtn;
    private TextView yearBox, zipBox, radiusBox;
    private Map<String, String[]> models = new HashMap<String, String[]>();
    static BaseModel baseQueryResults;
    static SimpleQueryFragment simpleQueryFragment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view;
        view = inflater.inflate(R.layout.fragment_simple_carquery, container, false);
        simpleQueryFragment = this;
        makeSpinner = view.findViewById(R.id.makeSpinner);
        modelSpinner = view.findViewById(R.id.modelSpinner);
        populateMakeSpinner();
        makeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (!makeSpinner.getSelectedItem().toString().equals("Select")){
                    populateModelSpinner(makeSpinner.getSelectedItem().toString());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        newBtn = view.findViewById(R.id.newRadioBtn);
        usedBtn = view.findViewById(R.id.usedRadioBtn);
        usedBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean selected) {
                if (selected){
                    yearBox.setVisibility(View.VISIBLE);
                }
                else{
                    yearBox.setVisibility(View.INVISIBLE);
                }
            }
        });
        yearBox = view.findViewById(R.id.YearBox);
        zipBox = view.findViewById(R.id.zipBox);
        radiusBox = view.findViewById(R.id.radiusBox);

        queryBtn = view.findViewById(R.id.queryBtn);
        queryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usedBtn.isChecked()){
                    if (yearBox.getText().toString().isEmpty() ||
                            makeSpinner.getSelectedItem().toString().isEmpty() ||
                            modelSpinner.getSelectedItem().toString().isEmpty() ||
                            zipBox.getText().toString().isEmpty() ||
                            radiusBox.getText().toString().isEmpty()){
                        Toast.makeText(view.getContext(), "Not all fields are used",
                                Toast.LENGTH_SHORT).show();
                    }
                    else{
                        QueryUsed(yearBox.getText().toString(),
                                makeSpinner.getSelectedItem().toString(),
                                modelSpinner.getSelectedItem().toString(),
                                zipBox.getText().toString(),
                                Integer.parseInt(radiusBox.getText().toString()));
                    }
                }
                else{
                    if (makeSpinner.getSelectedItem().toString().isEmpty() ||
                            modelSpinner.getSelectedItem().toString().isEmpty() ||
                            zipBox.getText().toString().isEmpty() ||
                            radiusBox.getText().toString().isEmpty()){
                        Toast.makeText(view.getContext(), "Not all fields are used",
                                Toast.LENGTH_SHORT).show();
                    }
                    else {
                        QueryNew(makeSpinner.getSelectedItem().toString(),
                                modelSpinner.getSelectedItem().toString(),
                                zipBox.getText().toString(),
                                Integer.parseInt(radiusBox.getText().toString()));
                    }
                }
            }
        });
        return view;
    }

    private void populateMakeSpinner(){
        String[] Manufacturers = CarData.getManufactures();
        List<String> spinnerContents = new ArrayList<>();
        for(String Make: Manufacturers){
            spinnerContents.add(Make);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_spinner_item, spinnerContents);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        makeSpinner.setAdapter(arrayAdapter);

    }

    private void populateModelSpinner(String make){
        String[] Models = CarData.getModels(make);
        List<String> spinnerContents = new ArrayList<>();
        for(String models: Models){
            spinnerContents.add(models);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_spinner_item, spinnerContents);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        modelSpinner.setAdapter(arrayAdapter);
    }

    private void QueryUsed(String Year, String Make, String Model, String Zip, int Radius) {
        ApiTemplate api = RetroFitClient.getClient().create(ApiTemplate.class);
        api.GetUsed("5ZWbDJVqHfDSReviXSOMyPpW1wQhYo2Z", Year, Make,
                "Edge", "48176", 10, "used").enqueue(new Callback<BaseModel>() {
            @Override
            public void onResponse(Call<BaseModel> call, Response<BaseModel> response) {
                if(response.isSuccessful()){
                    if (response.body().getNumFound() > 0){
                        baseQueryResults = response.body();
                        startActivity(new Intent(getContext(), ResultList.class));
                    }
                    else{
                        Toast.makeText(getContext(), "No results found",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<BaseModel> call, Throwable t) {

            }
        });
    }

    private void QueryNew(String Make, String Model, String Zip, int Radius) {
        ApiTemplate api = RetroFitClient.getClient().create(ApiTemplate.class);
        api.GetNew("5ZWbDJVqHfDSReviXSOMyPpW1wQhYo2Z", Make,
                Model, Zip, Radius, "new").enqueue(new Callback<BaseModel>() {
            @Override
            public void onResponse(Call<BaseModel> call, Response<BaseModel> response) {
                if (response.body().getNumFound() > 0){
                    baseQueryResults = response.body();
                    startActivity(new Intent(getContext(), ResultList.class));
                }
                else{
                    Toast.makeText(getContext(), "No results found",
                            Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<BaseModel> call, Throwable t) {

            }
        });
    }

    public static BaseModel getQueryResults(){
        return baseQueryResults;
    }
}
