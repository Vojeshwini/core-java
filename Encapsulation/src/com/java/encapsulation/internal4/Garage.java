package com.java.encapsulation.internal4;

public class Garage {
    private String garageName = "City Garage";
    private String location = "Hyderabad";
    private int numberOfVehicles = 25;
    private boolean is24HourService = true;

    public Garage() {
        System.out.println("Running the Garage");
    }


    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public void setIs24HourService(boolean is24HourService) {
        this.is24HourService = is24HourService;
    }


    public String getGarageName() {
        return this.garageName;
    }

    public String getLocation() {
        return this.location;
    }

    public int getNumberOfVehicles() {
        return this.numberOfVehicles;
    }

    public boolean getIs24HourService() {
        return this.is24HourService;
    }
}
