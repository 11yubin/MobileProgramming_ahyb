package com.example.hw3_target_team4_yubinahyeon;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView table;
    ImageView tv;
    ImageView sofa;
    ImageView plant;
    ImageView massage;
    ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        table = findViewById(R.id.table);
        tv = findViewById(R.id.tv);
        sofa = findViewById(R.id.sofa);
        plant = findViewById(R.id.plant);
        massage = findViewById(R.id.massage);
        picture = findViewById(R.id.picture);


        table.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float setX = motionEvent.getX();
                float setY = motionEvent.getY();
                float oldXvalue, oldYvalue;

                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        oldXvalue = motionEvent.getX();
                        oldYvalue = motionEvent.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        view.setX(view.getX() + motionEvent.getX() - view.getWidth() / 2);
                        view.setY(view.getY() + motionEvent.getY() - view.getHeight() / 2);
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                }
                return true;
            }
        });

        tv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float setX = motionEvent.getX();
                float setY = motionEvent.getY();
                float oldXvalue, oldYvalue;

                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        oldXvalue = motionEvent.getX();
                        oldYvalue = motionEvent.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        view.setX(view.getX() + motionEvent.getX() - view.getWidth() / 2);
                        view.setY(view.getY() + motionEvent.getY() - view.getHeight() / 2);
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                }
                return true;
            }
        });

        sofa.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float setX = motionEvent.getX();
                float setY = motionEvent.getY();
                float oldXvalue, oldYvalue;

                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        oldXvalue = motionEvent.getX();
                        oldYvalue = motionEvent.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        view.setX(view.getX() + motionEvent.getX() - view.getWidth() / 2);
                        view.setY(view.getY() + motionEvent.getY() - view.getHeight() / 2);
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                }
                return true;
            }
        });

        picture.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float setX = motionEvent.getX();
                float setY = motionEvent.getY();
                float oldXvalue, oldYvalue;

                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        oldXvalue = motionEvent.getX();
                        oldYvalue = motionEvent.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        view.setX(view.getX() + motionEvent.getX() - view.getWidth() / 2);
                        view.setY(view.getY() + motionEvent.getY() - view.getHeight() / 2);
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                }
                return true;
            }
        });

        plant.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float setX = motionEvent.getX();
                float setY = motionEvent.getY();
                float oldXvalue, oldYvalue;

                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        oldXvalue = motionEvent.getX();
                        oldYvalue = motionEvent.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        view.setX(view.getX() + motionEvent.getX() - view.getWidth() / 2);
                        view.setY(view.getY() + motionEvent.getY() - view.getHeight() / 2);
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                }
                return true;
            }
        });

        massage.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float setX = motionEvent.getX();
                float setY = motionEvent.getY();
                float oldXvalue, oldYvalue;

                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        oldXvalue = motionEvent.getX();
                        oldYvalue = motionEvent.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        view.setX(view.getX() + motionEvent.getX() - view.getWidth() / 2);
                        view.setY(view.getY() + motionEvent.getY() - view.getHeight() / 2);
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                }
                return true;
            }
        });
    }
}