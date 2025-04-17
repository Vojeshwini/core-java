package com.java.objects.internal;

import java.util.Objects;

public class Lamp {
    private String brand;
    private String type;
    private String color;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lamp) {
            Lamp lamp = (Lamp) obj;
            if (Objects.equals(this.brand, lamp.brand) &&
                    Objects.equals(this.type, lamp.type) &&
                    Objects.equals(this.color, lamp.color) &&
                    Objects.equals(this.price, lamp.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Lamp");
        return "Brand=" + brand + ",Type=" + type + ",Color=" + color + ",Price=" + price;
    }
}
