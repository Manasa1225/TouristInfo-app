package com.example.bunty.touristinfo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {
    private final int splash_time=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
// Using handler with postDelayed called runnable run method

        new Handler().postDelayed(new Runnable(){
            @Override
                    public void run(){
                Intent intent=new Intent(Splashscreen.this,LoginScreen.class);
                startActivity(intent);
                finish();
            }
        },splash_time);
    }
}
