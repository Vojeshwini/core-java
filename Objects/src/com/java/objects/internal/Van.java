package com.java.objects.internal;

import java.util.Objects;

public class Van {
    private String brand;
    private String model;
    private String color;
    private double price;

    public Van(String brand, String model, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Van) {
            Van van = (Van) obj;
            if (Objects.equals(this.brand, van.brand) &&
                    Objects.equals(this.model, van.model) &&
                    Objects.equals(this.color, van.color) &&
                    this.price == van.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Van");
        return "Brand=" + brand + ", Model=" + model + ", Color=" + color + ", Price=" + price;
    }
}
