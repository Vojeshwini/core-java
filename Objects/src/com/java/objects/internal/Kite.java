package com.java.objects.internal;

import java.util.Objects;

public class Kite {
    private String brand;
    private String size;
    private String pattern;
    private double weight;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Kite) {
            Kite kite = (Kite) obj;
            if (Objects.equals(this.brand, kite.brand) &&
                    Objects.equals(this.size, kite.size) &&
                    Objects.equals(this.pattern, kite.pattern) &&
                    Objects.equals(this.weight, kite.weight)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Kite");
        return "Brand=" + brand + ",Size=" + size + ",Pattern=" + pattern + ",Weight=" + weight;
    }
}
