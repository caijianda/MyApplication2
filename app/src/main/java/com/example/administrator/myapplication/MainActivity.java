package com.example.administrator.myapplication;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MyBrocast myBrocast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dd();
        service();
        service();
    }

    private void service() {
//        startService(new Intent(MainActivity.this,MyService.class));
    }

    private void dd(){
        MyView myView = findViewById(R.id.view);
        myView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("abc");
                intent.putExtra("ddd","ddddd");
                sendBroadcast(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        unregisterReceiver(myBrocast);
//        dfdf
    }
}
