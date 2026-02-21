package com.example.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_splash);

        new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // ignore
            }

            Intent go = new Intent(SplashActivity.this, ListPizzaActivity.class);
            startActivity(go);
            finish();
        }).start();
    }
}