package com.java.jsp.dto;

public class donationDto {
    String name;
    long l_contact;
    long l_amount;

    public void setName(String name) {
        this.name = name;
    }

    public void setL_contact(long l_contact) {
        this.l_contact = l_contact;
    }

    public void setL_amount(long l_amount) {
        this.l_amount = l_amount;
    }

    public String getName() {
        return name;
    }

    public long getL_contact() {
        return l_contact;
    }

    public long getL_amount() {
        return l_amount;
    }

    @Override
    public String toString() {
        return "donationDto{" +
                "name='" + name + '\'' +
                ", l_contact=" + l_contact +
                ", l_amount=" + l_amount +
                '}';
    }
}
