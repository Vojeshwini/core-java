package com.java.objects.internal;

import java.util.Objects;

public class Syrup {
    private String brand;
    private String flavor;
    private int volume;
    private double price;

    public Syrup(String brand, String flavor, int volume, double price) {
        this.brand = brand;
        this.flavor = flavor;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Syrup) {
            Syrup syrup = (Syrup) obj;
            if (Objects.equals(this.brand, syrup.brand) &&
                    Objects.equals(this.flavor, syrup.flavor) &&
                    Objects.equals(this.volume, syrup.volume) &&
                    Objects.equals(this.price, syrup.price)) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Syrup");
        return "Brand=" + brand + " Flavor=" + flavor + " Volume=" + volume + "ml Price=" + price;
    }
}
