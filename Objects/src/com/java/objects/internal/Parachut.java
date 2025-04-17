package com.java.objects.internal;

import java.util.Objects;

public class Parachut {
    private String material;
    private String color;
    private int capacity;
    private double price;

    public Parachut(String material, String color, int capacity, double price) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Parachut) {
            Parachut parachut = (Parachut) obj;
            if (Objects.equals(this.material, parachut.material) &&
                    Objects.equals(this.color, parachut.color) &&
                    this.capacity == parachut.capacity &&
                    this.price == parachut.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Parachut");
        return "Material=" + material + ", Color=" + color + ", Capacity=" + capacity + "kg, Price=" + price;
    }
}
