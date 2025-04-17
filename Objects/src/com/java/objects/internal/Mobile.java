package com.java.objects.internal;

import java.util.Objects;

public class Mobile {
    private String brand;
    private String model;
    private int price;
    private String country;

    public Mobile(String brand, String model, int price, String country) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.country = country;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mobile) {
            Mobile mobile = (Mobile) obj;
            if (Objects.equals(this.brand, mobile.brand) &&
                    Objects.equals(this.model, mobile.model) &&
                    this.price == mobile.price &&
                    Objects.equals(this.country, mobile.country)) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Mobile");
        return "Brand=" + brand + ", Model=" + model + ", Price=" + price + ", Country=" + country;
    }
}
