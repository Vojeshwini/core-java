package com.java.external;

import com.java.internal.Lock;

public class Secure implements Lock {
    @Override
    public void key() {
        System.out.println("running the key in the Secure");
    }

    @Override
    public void code() {
        System.out.println("running the code in the Secure");
    }

    @Override
    public void material() {
        System.out.println("running the material in the Secure");
    }

    @Override
    public void size() {
        System.out.println("running the size in the Secure");
    }

    @Override
    public void type() {
        System.out.println("running the type in the Secure");
    }

    @Override
    public void securityLevel() {
        System.out.println("running the securityLevel in the Secure");
    }

    @Override
    public void brand() {
        System.out.println("running the brand in the Secure");
    }
}
