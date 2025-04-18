package com.java.objects.internal;

import java.util.Objects;

public class Pineapple {
    private String variety;
    private String color;
    private double weight;
    private String origin;

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pineapple) {
            Pineapple pineapple = (Pineapple) obj;
            if (Objects.equals(this.variety, pineapple.variety) &&
                    Objects.equals(this.color, pineapple.color) &&
                    Objects.equals(this.weight, pineapple.weight) &&
                    Objects.equals(this.origin, pineapple.origin)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Pineapple");
        return "Variety=" + variety + ", Color=" + color + ", Weight=" + weight + "kg, Origin=" + origin;
    }
}
