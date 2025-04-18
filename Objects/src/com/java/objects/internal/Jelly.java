package com.java.objects.internal;

import java.util.Objects;

public class Jelly {
    private String flavor;
    private String brand;
    private String color;
    private double weight;

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Jelly) {
            Jelly jelly = (Jelly) obj;
            if (Objects.equals(this.flavor, jelly.flavor) &&
                    Objects.equals(this.brand, jelly.brand) &&
                    Objects.equals(this.color, jelly.color) &&
                    Objects.equals(this.weight, jelly.weight)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Jelly");
        return "Flavor=" + flavor + ",Brand=" + brand + ",Color=" + color + ",Weight=" + weight;
    }
}
