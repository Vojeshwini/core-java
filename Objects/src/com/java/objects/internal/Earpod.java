package com.java.objects.internal;

import java.util.Objects;

public class Earpod {
    private String brand;
    private String model;
    private String color;
    private double price;

    public Earpod(String brand, String model, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Earpod) {
            Earpod earpod = (Earpod) obj;
            if (Objects.equals(this.brand, earpod.brand) &&
                    Objects.equals(this.model, earpod.model) &&
                    Objects.equals(this.color, earpod.color) &&
                    this.price == earpod.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Earpod");
        return "Brand=" + brand + ", Model=" + model + ", Color=" + color + ", Price=" + price;
    }
}
