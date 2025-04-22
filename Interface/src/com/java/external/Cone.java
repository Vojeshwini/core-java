package com.java.external;

import com.java.internal.IceCream;

public class Cone implements IceCream {
    @Override
    public void flavor() {
        System.out.println("running the flavor in the Cone");
    }

    @Override
    public void color() {
        System.out.println("running the color in the Cone");
    }

    @Override
    public void cone() {
        System.out.println("running the cone in the Cone");
    }

    @Override
    public void size() {
        System.out.println("running the size in the Cone");
    }

    @Override
    public void price() {
        System.out.println("running the price in the Cone");
    }

    @Override
    public void toppings() {
        System.out.println("running the toppings in the Cone");
    }

    @Override
    public void brand() {
        System.out.println("running the brand in the Cone");
    }
}
