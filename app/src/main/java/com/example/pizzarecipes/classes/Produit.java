package com.example.pizzarecipes.classes;

public class Produit {

    private static long NEXT_ID = 1;

    private final long uid;
    private String label;
    private double cost;
    private int imgRes;
    private String duration;
    private String ingText;
    private String descriptionText;
    private String stepsText;

    public Produit() {
        uid = NEXT_ID++;
    }

    public Produit(String label, double cost, int imgRes, String duration,
                   String ingText, String descriptionText, String stepsText) {
        this.uid = NEXT_ID++;
        this.label = label;
        this.cost = cost;
        this.imgRes = imgRes;
        this.duration = duration;
        this.ingText = ingText;
        this.descriptionText = descriptionText;
        this.stepsText = stepsText;
    }

    public long getId() {
        return uid;
    }

    public String getNom() {
        return label;
    }

    public void setNom(String value) {
        label = value;
    }

    public double getPrix() {
        return cost;
    }

    public void setPrix(double value) {
        cost = value;
    }

    public int getImage() {
        return imgRes;
    }

    public void setImage(int value) {
        imgRes = value;
    }

    public String getTiming() {
        return duration;
    }

    public void setDuree(String value) {
        duration = value;
    }

    public String getIngredients() {
        return ingText;
    }

    public void setIngredients(String ingredients) {
        ingText = ingredients;
    }

    public String getDescription() {
        return descriptionText;
    }

    public void setDescription(String description) {
        descriptionText = description;
    }

    public String getEtapes() {
        return stepsText;
    }

    public void setEtapes(String value) {
        stepsText = value;
    }
}