package com.java.objects.internal;

import java.util.Objects;

public class Chips {
    private String brand;
    private String flavor;
    private int weight; // in grams
    private double price;

    public Chips(String brand, String flavor, int weight, double price) {
        this.brand = brand;
        this.flavor = flavor;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Chips) {
            Chips chips = (Chips) obj;
            if (Objects.equals(this.brand, chips.brand) &&
                    Objects.equals(this.flavor, chips.flavor) &&
                    this.weight == chips.weight &&
                    this.price == chips.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Chips");
        return "Brand=" + brand + ", Flavor=" + flavor + ", Weight=" + weight + "g, Price=" + price;
    }
}
