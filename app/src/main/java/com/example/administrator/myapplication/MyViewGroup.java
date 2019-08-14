package com.example.administrator.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MyViewGroup extends FrameLayout {

    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, @androidx.annotation.Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup(Context context, @androidx.annotation.Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("fff","MyViewGroup>>>>>dispatchTouchEvent>>>>");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        boolean bb=super.onTouchEvent(event);
        Log.d("fff","MyViewGroup>>>>>onTouchEvent>>>>");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("fff","MyViewGroup>>>>>onInterceptTouchEvent>>>>");
        return super.onInterceptTouchEvent(ev);
    }
}
