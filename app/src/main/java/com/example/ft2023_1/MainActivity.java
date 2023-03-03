package com.example.ft2023_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnBtnClickChangeColor(View view) {
        this.tvMain.setTextColor(Color.RED);
        this.tvMain.setText(R.string.change_color_name);
    }
}