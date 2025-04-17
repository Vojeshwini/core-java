package com.java.objects.internal;

import java.util.Objects;

public class Gun {
    private String brand;
    private String model;
    private String type;
    private double price;

    public Gun(String brand, String model, String type, double price) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Gun) {
            Gun gun = (Gun) obj;
            if (Objects.equals(this.brand, gun.brand) &&
                    Objects.equals(this.model, gun.model) &&
                    Objects.equals(this.type, gun.type) &&
                    this.price == gun.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Gun");
        return "Brand=" + brand + ", Model=" + model + ", Type=" + type + ", Price=" + price;
    }
}
