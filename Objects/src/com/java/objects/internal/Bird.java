package com.java.objects.internal;

import java.util.Objects;

public class Bird {
    private String name;
    private String color;
    private String habitat;
    private double wingspan;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bird) {
            Bird bird = (Bird) obj;
            if (Objects.equals(this.name, bird.name) &&
                    Objects.equals(this.color, bird.color) &&
                    Objects.equals(this.habitat, bird.habitat) &&
                    Objects.equals(this.wingspan, bird.wingspan)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Bird");
        return "Name=" + name + ",Color=" + color + ",Habitat=" + habitat + ",Wingspan=" + wingspan;
    }
}
