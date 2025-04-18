package com.java.objects.internal;

import java.util.Objects;

public class Peacock {
    private String species;
    private String color;
    private String habitat;
    private double weight;

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Peacock) {
            Peacock peacock = (Peacock) obj;
            if (Objects.equals(this.species, peacock.species) &&
                    Objects.equals(this.color, peacock.color) &&
                    Objects.equals(this.habitat, peacock.habitat) &&
                    Objects.equals(this.weight, peacock.weight)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Peacock");
        return "Species=" + species + ", Color=" + color + ", Habitat=" + habitat + ", Weight=" + weight;
    }
}
