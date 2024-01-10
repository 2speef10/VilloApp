package com.example.villoapp.Model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "snack_table")
public class Snack {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String topping;
    private String size;
    private String sauce;
    private String herbs;
    private String extras;
    private String drinks;

    // De constructor voor alle velden
    public Snack(String topping, String size, String sauce, String herbs, String extras, String drinks) {
        this.topping = topping;
        this.size = size;
        this.sauce = sauce;
        this.herbs = herbs;
        this.extras = extras;
        this.drinks = drinks;
        // Andere initialisaties indien nodig
    }

    // De constructor met alleen topping en size


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getHerbs() {
        return herbs;
    }

    public void setHerbs(String herbs) {
        this.herbs = herbs;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }
}
