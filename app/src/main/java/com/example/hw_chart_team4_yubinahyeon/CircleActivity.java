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

        Bundle extras = getIntent().getExtras();

        String f1 = extras.getString("f1");
        String f2 = extras.getString("f2");
        String f3 = extras.getString("f3");
        String f4 = extras.getString("f4");

        int c1 = extras.getInt("c1");
        int c2 = extras.getInt("c2");
        int c3 = extras.getInt("c3");
        int c4 = extras.getInt("c4");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CircleActivity.this, ChartActivity.class);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }
}
