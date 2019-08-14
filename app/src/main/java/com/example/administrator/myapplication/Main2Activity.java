package com.example.administrator.myapplication;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        intent.putExtra("ddd","ddddd");
        MyBrocast myBrocast = new MyBrocast();
        registerReceiver(myBrocast,new IntentFilter());
        sendBroadcast(intent);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("fff","MainActivity>>>>>dispatchTouchEvent>>>>");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("fff","MainActivity>>>>>onTouchEvent>>>>");
        return super.onTouchEvent(event);
    }



}
