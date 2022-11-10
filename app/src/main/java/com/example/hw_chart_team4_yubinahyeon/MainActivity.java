package com.example.hw_chart_team4_yubinahyeon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText food1, food2, food3, food4, calories1, calories2, calories3, calories4;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food1 = (EditText) findViewById(R.id.food1);
        food2 = (EditText) findViewById(R.id.food2);
        food3 = (EditText) findViewById(R.id.food3);
        food4 = (EditText) findViewById(R.id.food4);
        calories1 = (EditText) findViewById(R.id.calories1);
        calories2 = (EditText) findViewById(R.id.calories2);
        calories3 = (EditText) findViewById(R.id.calories3);
        calories4 = (EditText) findViewById(R.id.calories4);
        btn = (Button) findViewById(R.id.write);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String f1, f2, f3, f4;
                String c1, c2, c3, c4;

                f1 = food1.getText().toString();
                f2 = food2.getText().toString();
                f3 = food3.getText().toString();
                f4 = food4.getText().toString();
                c1 = calories1.getText().toString();
                c2 = calories2.getText().toString();
                c3 = calories3.getText().toString();
                c4 = calories4.getText().toString();

                Intent intent = new Intent(MainActivity.this, ChartActivity.class);

                Bundle extras = new Bundle();
                extras.putString("f1", f1);
                extras.putString("f2", f2);
                extras.putString("f3", f3);
                extras.putString("f4", f4);
                extras.putInt("c1", Integer.parseInt(c1));
                extras.putInt("c2", Integer.parseInt(c2));
                extras.putInt("c3", Integer.parseInt(c3));
                extras.putInt("c4", Integer.parseInt(c4));

                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }
}