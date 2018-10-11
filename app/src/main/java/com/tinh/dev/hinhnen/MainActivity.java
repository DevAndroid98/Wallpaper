package com.tinh.dev.hinhnen;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WallpaperManager manager=WallpaperManager.getInstance(getApplicationContext());
        try{
            manager.setResource(+R.drawable.hinhnen_1);
        }catch (Exception e){

        }
    }
}
