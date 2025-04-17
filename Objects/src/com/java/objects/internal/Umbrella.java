package com.java.objects.internal;

import java.util.Objects;

public class Umbrella {
    private String brand;
    private String color;
    private String material;
    private double price;

    public Umbrella(String brand, String color, String material, double price) {
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Umbrella) {
            Umbrella umbrella = (Umbrella) obj;
            if (Objects.equals(this.brand, umbrella.brand) &&
                    Objects.equals(this.color, umbrella.color) &&
                    Objects.equals(this.material, umbrella.material) &&
                    this.price == umbrella.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Umbrella");
        return "Brand=" + brand + ", Color=" + color + ", Material=" + material + ", Price=" + price;
    }
}
