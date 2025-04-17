package com.java.objects.internal;

import java.util.Objects;

public class Yogut {
    private String flavor;
    private String brand;
    private double weight;
    private double price;

    public Yogut(String flavor, String brand, double weight, double price) {
        this.flavor = flavor;
        this.brand = brand;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Yogut) {
            Yogut yogut = (Yogut) obj;
            if (Objects.equals(this.flavor, yogut.flavor) &&
                    Objects.equals(this.brand, yogut.brand) &&
                    this.weight == yogut.weight &&
                    this.price == yogut.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Yogut");
        return "Flavor=" + flavor + ", Brand=" + brand + ", Weight=" + weight + "g, Price=" + price;
    }
}
