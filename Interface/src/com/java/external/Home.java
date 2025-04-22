package com.java.external;

import com.java.internal.House;

public class Home implements House {
    @Override
    public void rooms() {
        System.out.println("running the rooms in the Home");
    }

    @Override
    public void doors() {
        System.out.println("running the doors in the Home");
    }

    @Override
    public void windows() {
        System.out.println("running the windows in the Home");
    }

    @Override
    public void floors() {
        System.out.println("running the floors in the Home");
    }

    @Override
    public void roof() {
        System.out.println("running the roof in the Home");
    }

    @Override
    public void paint() {
        System.out.println("running the paint in the Home");
    }

    @Override
    public void furniture() {
        System.out.println("running the furniture in the Home");
    }

    @Override
    public void garden() {
        System.out.println("running the garden in the Home");
    }

    @Override
    public void garage() {
        System.out.println("running the garage in the Home");
    }
}
