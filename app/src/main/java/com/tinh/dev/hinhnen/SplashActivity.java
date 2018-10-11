package com.tinh.dev.hinhnen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kkk);
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

            }
        },2000);
    }
}
