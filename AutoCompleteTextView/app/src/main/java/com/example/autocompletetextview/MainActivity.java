package com.example.autocompletetextview;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        getResources().getStringArray(R.array.countries);
        CountryAdapter countryAdapter = new CountryAdapter(this, R.layout.layout_custom, getListCountries());
        autoCompleteTextView.setAdapter(countryAdapter);
    }

    private List<Country> getListCountries() {
        List<Country> list =  new ArrayList<>();
        list.add(new Country("Abkhazia"));
        list.add(new Country("Afghanistan"));
        list.add(new Country("Albania"));
        list.add(new Country("Algeria"));
        list.add(new Country("American Samoa"));

        return list;
    }
}