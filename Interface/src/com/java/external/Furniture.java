package com.java.external;

import com.java.internal.Bed;

public class Furniture implements Bed {
    @Override
    public void size() {
        System.out.println("running the size in the Furniture");
    }

    @Override
    public void frame() {
        System.out.println("running the frame in the Furniture");
    }

    @Override
    public void mattress() {
        System.out.println("running the mattress in the Furniture");
    }

    @Override
    public void headboard() {
        System.out.println("running the headboard in the Furniture");
    }

    @Override
    public void color() {
        System.out.println("running the color in the Furniture");
    }

    @Override
    public void storage() {
        System.out.println("running the storage in the Furniture");
    }

    @Override
    public void material() {
        System.out.println("running the material in the Furniture");
    }
}
