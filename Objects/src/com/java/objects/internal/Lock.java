package com.java.objects.internal;

import java.util.Objects;

public class Lock {
    private String material;
    private String mechanism;
    private String securityLevel;
    private double price;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lock) {
            Lock lock = (Lock) obj;
            if (Objects.equals(this.material, lock.material) &&
                    Objects.equals(this.mechanism, lock.mechanism) &&
                    Objects.equals(this.securityLevel, lock.securityLevel) &&
                    Objects.equals(this.price, lock.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Lock");
        return "Material=" + material + ",Mechanism=" + mechanism + ",SecurityLevel=" + securityLevel + ",Price=" + price;
    }
}
