package com.java.objects.internal;

import java.util.Objects;

public class Zoo {
    private String name;
    private String location;
    private int numberOfAnimals;
    private double entryFee;

    public Zoo(String name, String location, int numberOfAnimals, double entryFee) {
        this.name = name;
        this.location = location;
        this.numberOfAnimals = numberOfAnimals;
        this.entryFee = entryFee;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Zoo) {
            Zoo zoo = (Zoo) obj;
            if (Objects.equals(this.name, zoo.name) &&
                    Objects.equals(this.location, zoo.location) &&
                    this.numberOfAnimals == zoo.numberOfAnimals &&
                    this.entryFee == zoo.entryFee) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Zoo");
        return "Name=" + name + ", Location=" + location + ", Animals=" + numberOfAnimals + ", Entry Fee=" + entryFee;
    }
}
