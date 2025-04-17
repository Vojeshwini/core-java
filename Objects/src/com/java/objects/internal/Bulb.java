package com.java.objects.internal;

import java.util.Objects;

public class Bulb {
    private String brand;
    private String type;
    private int wattage;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bulb) {
            Bulb bulb = (Bulb) obj;
            if (Objects.equals(this.brand, bulb.brand) &&
                    Objects.equals(this.type, bulb.type) &&
                    this.wattage == bulb.wattage &&
                    Objects.equals(this.price, bulb.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Bulb");
        return "Brand=" + brand + ",Type=" + type + ",Wattage=" + wattage + ",Price=" + price;
    }
}
