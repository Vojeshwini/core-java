package com.java.objects.internal;

import java.util.Objects;

public class Door {
    private String material;
    private String color;
    private String type;
    private double height;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Door) {
            Door door = (Door) obj;
            if (Objects.equals(this.material, door.material) &&
                    Objects.equals(this.color, door.color) &&
                    Objects.equals(this.type, door.type) &&
                    Objects.equals(this.height, door.height)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Door");
        return "Material=" + material + ",Color=" + color + ",Type=" + type + ",Height=" + height;
    }
}
