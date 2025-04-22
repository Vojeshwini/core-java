package com.java.external;

import com.java.internal.Cupboard;

public class Storage implements Cupboard {
    @Override
    public void door() {
        System.out.println("running the door in the Storage");
    }

    @Override
    public void shelf() {
        System.out.println("running the shelf in the Storage");
    }

    @Override
    public void lock() {
        System.out.println("running the lock in the Storage");
    }

    @Override
    public void handle() {
        System.out.println("running the handle in the Storage");
    }

    @Override
    public void material() {
        System.out.println("running the material in the Storage");
    }
}
