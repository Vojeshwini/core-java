package com.java.objects.internal;

import java.util.Objects;

public class HairBand {
    private String brand;
    private String color;
    private String material;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof HairBand) {
            HairBand hairBand = (HairBand) obj;
            if (Objects.equals(this.brand, hairBand.brand) &&
                    Objects.equals(this.color, hairBand.color) &&
                    Objects.equals(this.material, hairBand.material) &&
                    Objects.equals(this.price, hairBand.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of HairBand");
        return "Brand=" + brand + ",Color=" + color + ",Material=" + material + ",Price=" + price;
    }
}
