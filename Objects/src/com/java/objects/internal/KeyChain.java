package com.java.objects.internal;

import java.util.Objects;

public class KeyChain {
    private String maker;
    private String buildMaterial;
    private String design;
    private double cost;

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setBuildMaterial(String buildMaterial) {
        this.buildMaterial = buildMaterial;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof KeyChain) {
            KeyChain kc = (KeyChain) obj;
            if (Objects.equals(this.maker, kc.maker) &&
                    Objects.equals(this.buildMaterial, kc.buildMaterial) &&
                    Objects.equals(this.design, kc.design) &&
                    Objects.equals(this.cost, kc.cost)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of KeyChain");
        return "Maker=" + maker + ",BuildMaterial=" + buildMaterial + ",Design=" + design + ",Cost=" + cost;
    }
}
