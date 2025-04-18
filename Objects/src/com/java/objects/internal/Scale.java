package com.java.objects.internal;

import java.util.Objects;

public class Scale {
    private String brand;
    private String type;
    private String color;
    private double weightLimit;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeightLimit(double weightLimit) {
        this.weightLimit = weightLimit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Scale) {
            Scale scale = (Scale) obj;
            if (Objects.equals(this.brand, scale.brand) &&
                    Objects.equals(this.type, scale.type) &&
                    Objects.equals(this.color, scale.color) &&
                    Objects.equals(this.weightLimit, scale.weightLimit)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Scale");
        return "Brand=" + brand + ",Type=" + type + ",Color=" + color + ",WeightLimit=" + weightLimit;
    }
}
