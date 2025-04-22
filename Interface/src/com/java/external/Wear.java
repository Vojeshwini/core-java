package com.java.external;

import com.java.internal.Shirt;

public class Wear implements Shirt {
    @Override
    public void collar() {
        System.out.println("running the collar in the Wear");
    }

    @Override
    public void sleeve() {
        System.out.println("running the sleeve in the Wear");
    }

    @Override
    public void button() {
        System.out.println("running the button in the Wear");
    }

    @Override
    public void pocket() {
        System.out.println("running the pocket in the Wear");
    }

    @Override
    public void fabric() {
        System.out.println("running the fabric in the Wear");
    }
}
