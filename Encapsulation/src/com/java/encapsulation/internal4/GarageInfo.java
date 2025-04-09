package com.java.encapsulation.internal4;

public class GarageInfo {
    public GarageInfo() {
        System.out.println("Running GarageInfo");
    }

    public void showGarageDetails() {
        Garage garage = new Garage();
        System.out.println("Garage Name: " + garage.getGarageName());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Number of Vehicles: " + garage.getNumberOfVehicles());
        System.out.println("24 Hour Service: " + garage.getIs24HourService());

        garage.setGarageName("AutoPro");
        garage.setLocation("Chennai");
        garage.setNumberOfVehicles(40);
        garage.setIs24HourService(false);

        System.out.println("Updated Garage Name: " + garage.getGarageName());
        System.out.println("Updated Location: " + garage.getLocation());
        System.out.println("Updated Number of Vehicles: " + garage.getNumberOfVehicles());
        System.out.println("Updated 24 Hour Service: " + garage.getIs24HourService());
    }
}
