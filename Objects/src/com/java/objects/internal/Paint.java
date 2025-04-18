package com.java.objects.internal;

import java.util.Objects;

public class Paint {
    private String brand;
    private String color;
    private String type;
    private double quantity;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Paint) {
            Paint paint = (Paint) obj;
            if (Objects.equals(this.brand, paint.brand) &&
                    Objects.equals(this.color, paint.color) &&
                    Objects.equals(this.type, paint.type) &&
                    Objects.equals(this.quantity, paint.quantity)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Paint");
        return "Brand=" + brand + ",Color=" + color + ",Type=" + type + ",Quantity=" + quantity;
    }
}
