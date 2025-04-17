package com.java.objects.internal;

import java.util.Objects;

public class Jug {
    private String material;
    private String color;
    private int capacity;
    private double price;

    public Jug(String material, String color, int capacity, double price) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Jug) {
            Jug jug = (Jug) obj;
            if (Objects.equals(this.material, jug.material) &&
                    Objects.equals(this.color, jug.color) &&
                    this.capacity == jug.capacity &&
                    this.price == jug.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Jug");
        return "Material=" + material + ", Color=" + color + ", Capacity=" + capacity + "L, Price=" + price;
    }
}
