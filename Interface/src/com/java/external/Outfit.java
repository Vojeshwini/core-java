package com.java.external;

import com.java.internal.Dress;

public class Outfit implements Dress {
    @Override
    public void type() {
        System.out.println("running the type in the Outfit");
    }

    @Override
    public void color() {
        System.out.println("running the color in the Outfit");
    }

    @Override
    public void size() {
        System.out.println("running the size in the Outfit");
    }

    @Override
    public void material() {
        System.out.println("running the material in the Outfit");
    }

    @Override
    public void design() {
        System.out.println("running the design in the Outfit");
    }

    @Override
    public void price() {
        System.out.println("running the price in the Outfit");
    }

    @Override
    public void brand() {
        System.out.println("running the brand in the Outfit");
    }
}
