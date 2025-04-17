package com.java.objects.internal;

import java.util.Objects;

public class ToothBrush {
    private String brand;
    private String color;
    private String type; // e.g., Manual or Electric
    private double price;

    public ToothBrush(String brand, String color, String type, double price) {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ToothBrush) {
            ToothBrush toothbrush = (ToothBrush) obj;
            if (Objects.equals(this.brand, toothbrush.brand) &&
                    Objects.equals(this.color, toothbrush.color) &&
                    Objects.equals(this.type, toothbrush.type) &&
                    this.price == toothbrush.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String ToothBrush");
        return "Brand=" + brand + ", Color=" + color + ", Type=" + type + ", Price=" + price;
    }
}
