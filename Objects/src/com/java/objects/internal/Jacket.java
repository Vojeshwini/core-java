package com.java.objects.internal;

import java.util.Objects;

public class Jacket {
    private String fabric;
    private String color;
    private String size;
    private double price;

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Jacket) {
            Jacket jacket = (Jacket) obj;
            if (Objects.equals(this.fabric, jacket.fabric) &&
                    Objects.equals(this.color, jacket.color) &&
                    Objects.equals(this.size, jacket.size) &&
                    Objects.equals(this.price, jacket.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Jacket");
        return "Fabric=" + fabric + ",Color=" + color + ",Size=" + size + ",Price=" + price;
    }
}
