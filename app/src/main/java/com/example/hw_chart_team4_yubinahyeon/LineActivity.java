package com.example.hw_chart_team4_yubinahyeon;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LineActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.line_chart);

        TextView tv1 = (TextView) findViewById(R.id.menu1);
        TextView tv2 = (TextView) findViewById(R.id.menu2);
        TextView tv3 = (TextView) findViewById(R.id.menu3);
        TextView tv4 = (TextView) findViewById(R.id.menu4);
        Button btn = (Button) findViewById(R.id.lineBackButton);

        Bundle extras = getIntent().getExtras();

        String f1 = extras.getString("f1");
        String f2 = extras.getString("f2");
        String f3 = extras.getString("f3");
        String f4 = extras.getString("f4");

        int c1 = extras.getInt("c1");
        int c2 = extras.getInt("c2");
        int c3 = extras.getInt("c3");
        int c4 = extras.getInt("c4");

        tv1.setText(f1);
        tv2.setText(f2);
        tv3.setText(f3);
        tv4.setText(f4);

        Path p = new Path();
        p.moveTo(50, 410 - c1*2/5);
        p.lineTo(190, 410 - c2*2/5);
        p.lineTo(330, 410 - c3*2/5);
        p.lineTo(470, 410 - c4*2/5);

        p.moveTo(0, 420);
        p.lineTo(520, 420);
        p.moveTo(0, 420);
        p.lineTo(0, 0);

        p.close();

        ShapeDrawable d = new ShapeDrawable (new PathShape(p, 520, 420));
        d.setIntrinsicHeight(420);
        d.setIntrinsicWidth(520);
        d.getPaint().setColor(Color.RED);
        d.getPaint().setStyle(Paint.Style.STROKE);

        ImageView iv = (ImageView) findViewById(R.id.ImageViewforShape);
        iv.setImageDrawable(d);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LineActivity.this, ChartActivity.class);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }
}
