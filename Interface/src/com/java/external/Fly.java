package com.java.external;

import com.java.internal.Kite;

public class Fly implements Kite {
    @Override
    public void fly() {
        System.out.println("running the fly in the Fly");
    }

    @Override
    public void thread() {
        System.out.println("running the thread in the Fly");
    }

    @Override
    public void paper() {
        System.out.println("running the paper in the Fly");
    }

    @Override
    public void color() {
        System.out.println("running the color in the Fly");
    }

    @Override
    public void tail() {
        System.out.println("running the tail in the Fly");
    }
}
