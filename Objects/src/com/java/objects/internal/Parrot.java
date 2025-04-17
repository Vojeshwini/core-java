package com.java.objects.internal;

import java.util.Objects;

public class Parrot {
    private String species;
    private String color;
    private int age;
    private String origin;

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Parrot) {
            Parrot parrot = (Parrot) obj;
            if (Objects.equals(this.species, parrot.species) &&
                    Objects.equals(this.color, parrot.color) &&
                    this.age == parrot.age &&
                    Objects.equals(this.origin, parrot.origin)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Parrot");
        return "Species=" + species + ",Color=" + color + ",Age=" + age + ",Origin=" + origin;
    }
}
