package com.example.shimmerlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShimmerLayout layout = findViewById(
                R.id.shimmer_layout);
        layout.startShimmerAnimation();
    }
}