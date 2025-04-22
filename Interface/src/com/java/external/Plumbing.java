package com.java.external;

import com.java.internal.Pipe;

public class Plumbing implements Pipe {
    @Override
    public void diameter() {
        System.out.println("running the diameter in the Plumbing");
    }

    @Override
    public void material() {
        System.out.println("running the material in the Plumbing");
    }

    @Override
    public void length() {
        System.out.println("running the length in the Plumbing");
    }

    @Override
    public void pressureRating() {
        System.out.println("running the pressure rating in the Plumbing");
    }

    @Override
    public void coating() {
        System.out.println("running the coating in the Plumbing");
    }

    @Override
    public void type() {
        System.out.println("running the type in the Plumbing");
    }

    @Override
    public void temperatureRating() {
        System.out.println("running the temperature rating in the Plumbing");
    }

    @Override
    public void joints() {
        System.out.println("running the joints in the Plumbing");
    }

    @Override
    public void installationMethod() {
        System.out.println("running the installation method in the Plumbing");
    }
}
