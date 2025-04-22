package com.java.external;

import com.java.internal.Aeroplane;

public class Aircraft implements Aeroplane {
    @Override
    public void engine() {
        System.out.println("running the engine in the Aircraft");
    }

    @Override
    public void wings() {
        System.out.println("running the wings in the Aircraft");
    }

    @Override
    public void passengers() {
        System.out.println("running the passengers in the Aircraft");
    }

    @Override
    public void fuel() {
        System.out.println("running the fuel in the Aircraft");
    }

    @Override
    public void altitude() {
        System.out.println("running the altitude in the Aircraft");
    }

    @Override
    public void speed() {
        System.out.println("running the speed in the Aircraft");
    }

    @Override
    public void landingGear() {
        System.out.println("running the landing gear in the Aircraft");
    }

    @Override
    public void cockpit() {
        System.out.println("running the cockpit in the Aircraft");
    }

    @Override
    public void safetyFeatures() {
        System.out.println("running the safety features in the Aircraft");
    }
}
