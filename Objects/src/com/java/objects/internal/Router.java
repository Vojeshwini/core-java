package com.java.objects.internal;

import java.util.Objects;

public class Router {
    private String brand;
    private String model;
    private String color;
    private double price;

    public Router(String brand, String model, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Router) {
            Router router = (Router) obj;
            if (Objects.equals(this.brand, router.brand) &&
                    Objects.equals(this.model, router.model) &&
                    Objects.equals(this.color, router.color) &&
                    this.price == router.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Router");
        return "Brand=" + brand + ", Model=" + model + ", Color=" + color + ", Price=" + price;
    }
}
