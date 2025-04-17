package com.java.objects.internal;

import java.util.Objects;

public class Nest {
    private String material;
    private String size;
    private int numberOfEggs;
    private double price;

    public Nest(String material, String size, int numberOfEggs, double price) {
        this.material = material;
        this.size = size;
        this.numberOfEggs = numberOfEggs;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Nest) {
            Nest nest = (Nest) obj;
            if (Objects.equals(this.material, nest.material) &&
                    Objects.equals(this.size, nest.size) &&
                    this.numberOfEggs == nest.numberOfEggs &&
                    this.price == nest.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Nest");
        return "Material=" + material + ", Size=" + size + ", Number of Eggs=" + numberOfEggs + ", Price=" + price;
    }
}
