package com.example.hw3_target_team4_yubinahyeon;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class RoomBackground extends View {

    public static int pt1Color = Color.GRAY;
    public static int pt2Color = Color.LTGRAY;
    public static int pt3Color = Color.DKGRAY;

    public RoomBackground(Context context) {
        super(context);
    }
    public RoomBackground(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public RoomBackground(Context context, AttributeSet attrs, int defaultStyle) {
        super(context, attrs, defaultStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE);

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(pt1Color);
        paint.setStrokeWidth(5);
        Path path1 = new Path();
        path1.moveTo(canvas.getWidth()*2/5, canvas.getHeight()*2/5);
        path1.lineTo(canvas.getWidth()*1/10, canvas.getHeight()*3/5);
        path1.lineTo(canvas.getWidth()*1/2, canvas.getHeight()*7/10);
        path1.lineTo(canvas.getWidth()*4/5, canvas.getHeight()*1/2);
        canvas.drawPath(path1, paint);

        paint.setColor(pt2Color);
        paint.setStrokeWidth(5);
        Path path2 = new Path();
        path2.moveTo(canvas.getWidth()*2/5, canvas.getHeight()*2/5);
        path2.lineTo(canvas.getWidth()*1/10, canvas.getHeight()*3/5);
        path2.lineTo(canvas.getWidth()*1/10, canvas.getHeight()*3/10);
        path2.lineTo(canvas.getWidth()*2/5, canvas.getHeight()*1/10);
        canvas.drawPath(path2, paint);

        paint.setColor(pt3Color);
        paint.setStrokeWidth(5);
        Path path3 = new Path();
        path3.moveTo(canvas.getWidth()*2/5, canvas.getHeight()*2/5);
        path3.lineTo(canvas.getWidth()*2/5, canvas.getHeight()*1/10);
        path3.lineTo(canvas.getWidth()*4/5, canvas.getHeight()*1/5);
        path3.lineTo(canvas.getWidth()*4/5, canvas.getHeight()*1/2);
        canvas.drawPath(path3, paint);

        invalidate();
    }
}
