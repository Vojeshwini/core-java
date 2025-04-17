package com.java.objects.internal;

import java.util.Objects;

public class Salads {
    private String type;
    private String ingredients;
    private int quantity; // in grams
    private double price;

    public Salads(String type, String ingredients, int quantity, double price) {
        this.type = type;
        this.ingredients = ingredients;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Salads) {
            Salads salads = (Salads) obj;
            if (Objects.equals(this.type, salads.type) &&
                    Objects.equals(this.ingredients, salads.ingredients) &&
                    this.quantity == salads.quantity &&
                    this.price == salads.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Salads");
        return "Type=" + type + ", Ingredients=" + ingredients + ", Quantity=" + quantity + "g, Price=" + price;
    }
}
