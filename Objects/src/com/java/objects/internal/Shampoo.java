package com.java.objects.internal;

import java.util.Objects;

public class Shampoo {
    private String brand;
    private String fragrance;
    private int volume;
    private double price;

    public Shampoo(String brand, String fragrance, int volume, double price) {
        this.brand = brand;
        this.fragrance = fragrance;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Shampoo) {
            Shampoo shampoo = (Shampoo) obj;
            if (Objects.equals(this.brand, shampoo.brand) &&
                    Objects.equals(this.fragrance, shampoo.fragrance) &&
                    this.volume == shampoo.volume &&
                    this.price == shampoo.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Shampoo");
        return "Brand=" + brand + ", Fragrance=" + fragrance + ", Volume=" + volume + "ml, Price=" + price;
    }
}
