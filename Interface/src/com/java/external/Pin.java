package com.java.external;

import com.java.internal.Clip;

public class Pin implements Clip {
    @Override
    public void color() {
        System.out.println("running the color in the Pin");
    }

    @Override
    public void size() {
        System.out.println("running the size in the Pin");
    }

    @Override
    public void type() {
        System.out.println("running the type in the Pin");
    }

    @Override
    public void material() {
        System.out.println("running the material in the Pin");
    }

    @Override
    public void grip() {
        System.out.println("running the grip in the Pin");
    }

    @Override
    public void weight() {
        System.out.println("running the weight in the Pin");
    }

    @Override
    public void brand() {
        System.out.println("running the brand in the Pin");
    }
}
