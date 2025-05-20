package com.java.jsp.dto;

public class FirDto {
    String name;
    long n_contact;
    String location;
    String details;

    public void setName(String name) {
        this.name = name;
    }

    public void setN_contact(long n_contact) {
        this.n_contact = n_contact;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public long getN_contact() {
        return n_contact;
    }

    public String getLocation() {
        return location;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "FirDto{" +
                "name='" + name + '\'' +
                ", n_contact=" + n_contact +
                ", location='" + location + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
