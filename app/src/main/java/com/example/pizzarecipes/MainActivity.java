package com.example.pizzarecipes;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private View rootView;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rootView = findViewById(R.id.main);
        setupInsets();
    }

    private void setupInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(rootView, (view, windowInsets) -> {

            Insets bars = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars());

            view.setPadding(
                    bars.left,
                    bars.top,
                    bars.right,
                    bars.bottom
            );

            return windowInsets;
        });
    }
}