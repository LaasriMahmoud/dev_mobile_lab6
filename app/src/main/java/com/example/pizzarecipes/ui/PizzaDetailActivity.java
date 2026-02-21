package com.example.pizzarecipes.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.services.ProduitService;

public class PizzaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_pizza_detail);

        long pizzaKey = getIntent().getLongExtra("pizza_id", -1L);
        Produit selected = ProduitService.getInstance().findById(pizzaKey);

        ImageView picture = findViewById(R.id.img);
        TextView titleView = findViewById(R.id.title);
        TextView metaView = findViewById(R.id.meta);
        TextView ingView = findViewById(R.id.ingredients);
        TextView descView = findViewById(R.id.desc);
        TextView stepsView = findViewById(R.id.steps);

        if (selected == null) {
            titleView.setText("Pizza introuvable !");
            return;
        }

        picture.setImageResource(selected.getImage());
        titleView.setText(selected.getNom());
        metaView.setText(selected.getTiming() + " • " + selected.getPrix() + " DH");
        ingView.setText(selected.getIngredients());
        descView.setText(selected.getDescription());
        stepsView.setText(selected.getEtapes());
    }
}