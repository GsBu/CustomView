package com.example.gs.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "MainActivity";

    private LinearLayout llRootView;
    private ScrollView svRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llRootView = findViewById(R.id.ll_root_view);
        svRootView = findViewById(R.id.sv_root_view);

        LayoutInflater inflater = LayoutInflater.from(this);
        View toolbar = inflater.inflate(R.layout.toolbar, null);

        llRootView.addView(toolbar);
    }
}
