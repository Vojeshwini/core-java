package com.java.objects.internal;

import java.util.Objects;

public class PanCard {
    private String panNumber;
    private String name;
    private String dob;
    private String address;

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof PanCard) {
            PanCard panCard = (PanCard) obj;
            if (Objects.equals(this.panNumber, panCard.panNumber) &&
                    Objects.equals(this.name, panCard.name) &&
                    Objects.equals(this.dob, panCard.dob) &&
                    Objects.equals(this.address, panCard.address)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of PanCard");
        return "PanNumber=" + panNumber + ", Name=" + name + ", DOB=" + dob + ", Address=" + address;
    }
}
