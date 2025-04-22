package com.java.external;

import com.java.internal.Bricks;

public class Construction implements Bricks {
    @Override
    public void shape() {
        System.out.println("running the shape in the Construction");
    }

    @Override
    public void size() {
        System.out.println("running the size in the Construction");
    }

    @Override
    public void color() {
        System.out.println("running the color in the Construction");
    }

    @Override
    public void weight() {
        System.out.println("running the weight in the Construction");
    }

    @Override
    public void material() {
        System.out.println("running the material in the Construction");
    }

    @Override
    public void type() {
        System.out.println("running the type in the Construction");
    }

    @Override
    public void strength() {
        System.out.println("running the strength in the Construction");
    }

    @Override
    public void cost() {
        System.out.println("running the cost in the Construction");
    }

    @Override
    public void usage() {
        System.out.println("running the usage in the Construction");
    }
}
