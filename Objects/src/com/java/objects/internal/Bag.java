package com.java.objects.internal;

import java.util.Objects;

public class Bag {
    private String brand;
    private String color;
    private String type;
    private long price;

    public Bag(String brand,String color,String type,long price){
        this.brand=brand;
        this.color=color;
        this.type=type;
        this.price=price;

    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bag) {
            Bag bag = (Bag) obj;
            if (Objects.equals(this.brand, bag.brand) && Objects.equals(this.color, bag.color) && Objects.equals(this.type, bag.type) && Objects.equals(this.price, bag.price)) {
                System.out.println("matching");
                return true;
            }
        }

return false;

    }
    @Override
    public String toString(){
        System.out.println("to String Bag");
        return "Brand="+brand+"color="+color+"price="+price;
    }


}
