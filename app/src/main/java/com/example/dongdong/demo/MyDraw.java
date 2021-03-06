package com.example.dongdong.demo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.jar.Attributes;

/**
 * Created by dongdong on 2015/7/15.
 */
public class MyDraw extends View {
    Paint paint = new Paint();
    public float eventX = 50;
    public float eventY = 50;
    public MyDraw(Context context) {
        super(context);
    }
    public MyDraw(Context context,AttributeSet set){
        super(context,set);
    }
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(eventX,eventY,10,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        eventX = event.getX();
        eventY = event.getY();
        invalidate();
        return true;
    }
}
