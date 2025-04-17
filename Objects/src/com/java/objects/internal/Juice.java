package com.java.objects.internal;

import java.util.Objects;

public class Juice {
    private String brand;
    private String flavor;
    private int quantity; // in ml
    private double price;

    public Juice(String brand, String flavor, int quantity, double price) {
        this.brand = brand;
        this.flavor = flavor;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Juice) {
            Juice juice = (Juice) obj;
            if (Objects.equals(this.brand, juice.brand) &&
                    Objects.equals(this.flavor, juice.flavor) &&
                    this.quantity == juice.quantity &&
                    this.price == juice.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Juice");
        return "Brand=" + brand + ", Flavor=" + flavor + ", Quantity=" + quantity + "ml, Price=" + price;
    }
}
