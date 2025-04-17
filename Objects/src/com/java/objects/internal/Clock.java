package com.java.objects.internal;

import java.util.Objects;

public class Clock {
    private String brand;
    private String type;
    private String color;
    private double price;

    public Clock(String brand, String type, String color, double price) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Clock) {
            Clock clock = (Clock) obj;
            if (Objects.equals(this.brand, clock.brand) &&
                    Objects.equals(this.type, clock.type) &&
                    Objects.equals(this.color, clock.color) &&
                    Objects.equals(this.price, clock.price)) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Clock");
        return "Brand=" + brand + ", Type=" + type + ", Color=" + color + ", Price=" + price;
    }
}
