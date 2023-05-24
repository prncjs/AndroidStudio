package com.example.pombud;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
    private static final long SPLASH_SCREEN_DELAY = 3000; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Delay the splash screen for the specified duration
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the login activity
                Intent intent = new Intent(SplashScreen.this, LoginPage.class);
                startActivity(intent);
                finish(); // Finish the splash activity
            }
        }, SPLASH_SCREEN_DELAY);
    }
}