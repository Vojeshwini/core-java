package com.java.objects.internal;

import java.util.Objects;

public class IceCream {
    private String flavor;
    private String size;
    private boolean isVegan;
    private double price;

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setVegan(boolean isVegan) {
        this.isVegan = isVegan;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof IceCream) {
            IceCream iceCream = (IceCream) obj;
            if (Objects.equals(this.flavor, iceCream.flavor) &&
                    Objects.equals(this.size, iceCream.size) &&
                    this.isVegan == iceCream.isVegan &&
                    Objects.equals(this.price, iceCream.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of IceCream");
        return "Flavor=" + flavor + ",Size=" + size + ",Vegan=" + isVegan + ",Price=" + price;
    }
}
