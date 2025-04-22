package com.java.external;

import com.java.internal.Truck;

public class Transport implements Truck {
    @Override
    public void engine() {
        System.out.println("running the engine in the Transport");
    }

    @Override
    public void wheels() {
        System.out.println("running the wheels in the Transport");
    }

    @Override
    public void cargoCapacity() {
        System.out.println("running the cargo capacity in the Transport");
    }

    @Override
    public void fuelType() {
        System.out.println("running the fuel type in the Transport");
    }

    @Override
    public void axle() {
        System.out.println("running the axle in the Transport");
    }

    @Override
    public void cabin() {
        System.out.println("running the cabin in the Transport");
    }

    @Override
    public void loadType() {
        System.out.println("running the load type in the Transport");
    }

    @Override
    public void brand() {
        System.out.println("running the brand in the Transport");
    }

    @Override
    public void speedLimit() {
        System.out.println("running the speed limit in the Transport");
    }
}
