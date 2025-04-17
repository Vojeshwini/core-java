package com.java.objects.internal;

import java.util.Objects;

public class Pen {
    private String brand;
    private String color;
    private String type;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pen) {
            Pen pen = (Pen) obj;
            if (Objects.equals(this.brand, pen.brand) &&
                    Objects.equals(this.color, pen.color) &&
                    Objects.equals(this.type, pen.type) &&
                    Objects.equals(this.price, pen.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Pen");
        return "Brand=" + brand + ",Color=" + color + ",Type=" + type + ",Price=" + price;
    }
}
