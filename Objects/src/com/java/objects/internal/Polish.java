package com.java.objects.internal;

import java.util.Objects;

public class Polish {
    private String brand;
    private String type;
    private String purpose;
    private double quantity;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Polish) {
            Polish polish = (Polish) obj;
            if (Objects.equals(this.brand, polish.brand) &&
                    Objects.equals(this.type, polish.type) &&
                    Objects.equals(this.purpose, polish.purpose) &&
                    Objects.equals(this.quantity, polish.quantity)) {
                System.out.println("Matching");
                return true;
            }
        }
      return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Polish");
        return "Brand=" + brand + ",Type=" + type + ",Purpose=" + purpose + ",Quantity=" + quantity;
    }
}
