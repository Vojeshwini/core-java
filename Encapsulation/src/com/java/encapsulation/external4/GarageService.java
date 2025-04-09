package com.java.encapsulation.external4;

import com.java.encapsulation.internal4.Garage
public class GarageService {
    public void showGarage() {
        Garage garage = new Garage();
        System.out.println("Garage Name: " + garage.getGarageName());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Number of Vehicles: " + garage.getNumberOfVehicles());
        System.out.println("24 Hour Service: " + garage.getIs24HourService());
    }
}
