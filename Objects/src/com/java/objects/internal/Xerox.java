package com.java.objects.internal;

import java.util.Objects;

public class Xerox {
    private String brand;
    private String model;
    private String colorType;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColorType(String colorType) {
        this.colorType = colorType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Xerox) {
            Xerox xerox = (Xerox) obj;
            if (Objects.equals(this.brand, xerox.brand) &&
                    Objects.equals(this.model, xerox.model) &&
                    Objects.equals(this.colorType, xerox.colorType) &&
                    Objects.equals(this.price, xerox.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Xerox");
        return "Brand=" + brand + ",Model=" + model + ",ColorType=" + colorType + ",Price=" + price;
    }
}
