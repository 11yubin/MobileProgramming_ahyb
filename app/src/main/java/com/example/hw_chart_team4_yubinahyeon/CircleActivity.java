package com.example.hw_chart_team4_yubinahyeon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CircleActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle_chart);

        Button btn = (Button) findViewById(R.id.circleBackButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CircleActivity.this, ChartActivity.class);
                startActivity(intent);
            }
        });
    }
}
