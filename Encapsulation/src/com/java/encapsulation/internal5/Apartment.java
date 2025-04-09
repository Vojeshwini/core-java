package com.java.encapsulation.internal5;

public class Apartment {
    private String apartmentName = "Green Residency";
    private String location = "Bangalore";
    private int numberOfFlats = 120;
    private boolean hasLift = true;

    public Apartment() {
        System.out.println("Running the Apartment");
    }

    // Setters
    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfFlats(int numberOfFlats) {
        this.numberOfFlats = numberOfFlats;
    }

    public void setHasLift(boolean hasLift) {
        this.hasLift = hasLift;
    }

    // Getters
    public String getApartmentName() {
        return this.apartmentName;
    }

    public String getLocation() {
        return this.location;
    }

    public int getNumberOfFlats() {
        return this.numberOfFlats;
    }

    public boolean getHasLift() {
        return this.hasLift;
    }
}
