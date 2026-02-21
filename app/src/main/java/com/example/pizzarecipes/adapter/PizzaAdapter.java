package com.example.pizzarecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private Context mContext;
    private List<Produit> itemList;

    public PizzaAdapter(Context ctx, List<Produit> list) {
        this.mContext = ctx;
        this.itemList = list;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Produit getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return itemList.get(position).getId();
    }

    @Override
    public View getView(int index, View recycledView, ViewGroup parent) {

        View rowView = recycledView;

        if (rowView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            rowView = inflater.inflate(R.layout.row_pizza, parent, false);
        }

        ImageView imagePizza = rowView.findViewById(R.id.imgPizza);
        TextView textName = rowView.findViewById(R.id.tvNom);
        TextView textDetails = rowView.findViewById(R.id.tvMeta);

        Produit currentItem = itemList.get(index);

        imagePizza.setImageResource(currentItem.getImage());
        textName.setText(currentItem.getNom());
        textDetails.setText(currentItem.getTiming() + " • " + currentItem.getPrix() + " €");

        return rowView;
    }
}