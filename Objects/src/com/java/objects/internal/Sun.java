package com.java.objects.internal;

import java.util.Objects;

public class Sun {
    private String color;
    private double temperature;
    private String galaxy;
    private double radius;

    public void setColor(String color) {
        this.color = color;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setGalaxy(String galaxy) {
        this.galaxy = galaxy;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sun) {
            Sun sun = (Sun) obj;
            if (Objects.equals(this.color, sun.color) &&
                    Objects.equals(this.temperature, sun.temperature) &&
                    Objects.equals(this.galaxy, sun.galaxy) &&
                    Objects.equals(this.radius, sun.radius)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Sun");
        return "Color=" + color + ",Temperature=" + temperature + ",Galaxy=" + galaxy + ",Radius=" + radius;
    }
}
