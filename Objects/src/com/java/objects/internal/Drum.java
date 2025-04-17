package com.java.objects.internal;

import java.util.Objects;

public class Drum {
    private String brand;
    private String type;
    private String material;
    private double price;

    public Drum(String brand, String type, String material, double price) {
        this.brand = brand;
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Drum) {
            Drum drum = (Drum) obj;
            if (Objects.equals(this.brand, drum.brand) &&
                    Objects.equals(this.type, drum.type) &&
                    Objects.equals(this.material, drum.material) &&
                    this.price == drum.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Drum");
        return "Brand=" + brand + ", Type=" + type + ", Material=" + material + ", Price=" + price;
    }
}
