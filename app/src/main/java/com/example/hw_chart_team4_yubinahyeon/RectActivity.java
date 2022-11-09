package com.example.hw_chart_team4_yubinahyeon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RectActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rect_chart);

        Button btn = (Button) findViewById(R.id.rectBackButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RectActivity.this, ChartActivity.class);
                startActivity(intent);
            }
        });
    }
}
