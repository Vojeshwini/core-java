package com.java.objects.internal;

import java.util.Objects;

public class Pouch {
    private String brand;
    private String color;
    private String material;
    private int price;

    public Pouch(String brand, String color, String material, int price) {
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pouch) {
            Pouch pouch = (Pouch) obj;
            if (Objects.equals(this.brand, pouch.brand) && Objects.equals(this.color, pouch.color) && Objects.equals(this.material, pouch.material) && Objects.equals(this.price, pouch.price)) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Pouch");
        return "Brand=" + brand + ", Color=" + color + ", Material=" + material + ", Price=" + price;
    }
}
