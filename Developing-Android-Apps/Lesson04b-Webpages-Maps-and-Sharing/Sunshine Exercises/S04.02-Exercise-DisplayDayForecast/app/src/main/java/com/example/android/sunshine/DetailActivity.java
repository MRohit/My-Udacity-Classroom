package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView displayWeatherData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        displayWeatherData = (TextView) findViewById(R.id.display_weather);

        Intent intentThatStarted = getIntent();
        if(intentThatStarted != null) {
            if (intentThatStarted.hasExtra(Intent.EXTRA_TEXT)) {
                String messageSent = intentThatStarted.getStringExtra(Intent.EXTRA_TEXT);
                Log.v("String::",messageSent);
                displayWeatherData.setText(messageSent);
            }
        }
    }
}