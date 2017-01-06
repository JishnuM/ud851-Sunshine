package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView mDetailView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        mDetailView = (TextView) findViewById(R.id.tv_weather_detail);
        Intent intentThatStartedThisActivity = getIntent();
        String weatherDetail;
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            weatherDetail = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);
            mDetailView.setText(weatherDetail);
        }
    }
}