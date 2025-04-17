package com.java.objects.internal;

import java.util.Objects;

public class Crown {
    private String material;
    private String style;
    private String gemstone;
    private double weight;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setGemstone(String gemstone) {
        this.gemstone = gemstone;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Crown) {
            Crown crown = (Crown) obj;
            if (Objects.equals(this.material, crown.material) &&
                    Objects.equals(this.style, crown.style) &&
                    Objects.equals(this.gemstone, crown.gemstone) &&
                    Objects.equals(this.weight, crown.weight)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Crown");
        return "Material=" + material + ",Style=" + style + ",Gemstone=" + gemstone + ",Weight=" + weight;
    }
}
