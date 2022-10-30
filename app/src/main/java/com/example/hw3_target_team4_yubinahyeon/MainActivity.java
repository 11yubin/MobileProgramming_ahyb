package com.example.hw3_target_team4_yubinahyeon;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.example.hw3_target_team4_yubinahyeon.RoomBackground;

public class MainActivity extends AppCompatActivity {

    ImageView table;
    ImageView tv;
    ImageView sofa;
    ImageView plant;
    ImageView massage;
    ImageView picture;

    Button rgb;
    Button original;
    Button cmy;

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

        rgb = findViewById(R.id.buttonRGB);
        cmy = findViewById(R.id.buttonCMY);
        original = findViewById(R.id.buttonOrigin);

        rgb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RoomBackground.pt1Color = Color.RED;
                RoomBackground.pt2Color = Color.GREEN;
                RoomBackground.pt3Color = Color.BLUE;
            }
        });

        original.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RoomBackground.pt1Color = Color.GRAY;
                RoomBackground.pt2Color = Color.LTGRAY;
                RoomBackground.pt3Color = Color.DKGRAY;
            }
        });

        cmy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RoomBackground.pt1Color = Color.CYAN;
                RoomBackground.pt2Color = Color.MAGENTA;
                RoomBackground.pt3Color = Color.YELLOW;
            }
        });
    }

}