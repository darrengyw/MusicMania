package com.example.musicstream;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        splashbg.start(); //startup splash screen
    }

    Thread splashbg = new Thread() {
        public void run() {
            try {
                sleep(2000); //load for 2seconds
                Intent intent = new Intent(getBaseContext(),MainActivity.class); //Change to MainActivity
                startActivity(intent);
                finish();
            } catch (Exception e) {
            }
        }
    };
}