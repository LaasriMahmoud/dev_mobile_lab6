package com.example.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.adapter.PizzaAdapter;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.services.ProduitService;

import java.util.List;

public class ListPizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_list_pizza);

        ListView listView = findViewById(R.id.Pizzas);

        List<Produit> dataList = ProduitService.getInstance().findAll();
        PizzaAdapter adapter = new PizzaAdapter(this, dataList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, rowId) -> {
            Intent details = new Intent(ListPizzaActivity.this, PizzaDetailActivity.class);
            details.putExtra("pizza_id", rowId);
            startActivity(details);
        });
    }
}