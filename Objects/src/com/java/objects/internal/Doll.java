package com.java.objects.internal;

import java.util.Objects;

public class Doll {
    private String name;
    private String material;
    private String color;
    private double price;

    public Doll(String name, String material, String color, double price) {
        this.name = name;
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Doll) {
            Doll doll = (Doll) obj;
            if (Objects.equals(this.name, doll.name) &&
                    Objects.equals(this.material, doll.material) &&
                    Objects.equals(this.color, doll.color) &&
                    this.price == doll.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Doll");
        return "Name=" + name + ", Material=" + material + ", Color=" + color + ", Price=" + price;
    }
}
