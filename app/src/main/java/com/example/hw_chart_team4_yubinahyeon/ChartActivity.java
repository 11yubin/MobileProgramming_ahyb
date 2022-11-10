package com.example.hw_chart_team4_yubinahyeon;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hw_chart_team4_yubinahyeon.MainActivity;
import androidx.appcompat.app.AppCompatActivity;

public class ChartActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstancestate) {
        super.onCreate(savedInstancestate);
        setContentView(R.layout.draw_chart);

        TextView tv = (TextView) findViewById(R.id.textView);
        Button back = (Button) findViewById(R.id.backButton);
        Button line = (Button) findViewById(R.id.lineChart);
        Button rect = (Button) findViewById(R.id.histogram);
        Button circle = (Button) findViewById(R.id.circleChart);

        Bundle extras = getIntent().getExtras();
        tv.setText("food1 " + extras.getString("f1") + ": " + extras.getInt("c1") + "Kcal\n" +
                "food2 " + extras.getString("f2") + ": " + extras.getInt("c2") + "Kcal\n" +
                "food3 " + extras.getString("f3") + ": " + extras.getInt("c3") + "Kcal\n" +
                "food4 " + extras.getString("f4") + ": " + extras.getInt("c4") + "Kcal\n");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent confirm = new Intent(ChartActivity.this, MainActivity.class);
                startActivity(confirm);
            }
        });

        line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent confirm = new Intent(ChartActivity.this, LineActivity.class);
                confirm.putExtras(extras);
                startActivity(confirm);
            }
        });

        rect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent confirm = new Intent(ChartActivity.this, RectActivity.class);
                confirm.putExtras(extras);
                startActivity(confirm);
            }
        });

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent confirm = new Intent(ChartActivity.this, CircleActivity.class);
                confirm.putExtras(extras);
                startActivity(confirm);
            }
        });
    }
}