package com.example.ft2023_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvMain=findViewById(R.id.tvMain);
    }

    public void onBtnChangeMainText(View view) {
        this.tvMain.setText("Text was changed!");
    }
}