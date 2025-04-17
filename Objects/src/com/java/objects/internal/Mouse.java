package com.java.objects.internal;
import java.util.Objects;


public class Mouse {
    private String brand;
    private int price;
    private String color;
    private String mdfCountry;

    public Mouse(String brand, int price, String color, String mdfCountry) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.mdfCountry = mdfCountry;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null && obj instanceof Mouse) {
            Mouse mouse = (Mouse) obj;
            if (Objects.equals(this.brand, mouse.brand) && Objects.equals(this.mdfCountry, mouse.mdfCountry)) {
                System.out.println("the string is matching");
                return true;
            }

        }

        return false;
    }
            @Override
            public String toString () {
                System.out.println("Chocolate");
                return "Brand=" + brand + ",color=" + color + ",Price=" + price + ",mdfCountry=" + mdfCountry;
            }

        }



