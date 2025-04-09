package com.java.encapsulation.internal3;

public class Gym {
    private String gymName = "FitZone";
    private String location = "Bangalore";
    private int equipmentCount = 50;
    private boolean isOpen = true;

    public Gym() {
        System.out.println("Running the Gym");
    }

    // Setters
    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEquipmentCount(int equipmentCount) {
        this.equipmentCount = equipmentCount;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    // Getters
    public String getGymName() {
        return this.gymName;
    }

    public String getLocation() {
        return this.location;
    }

    public int getEquipmentCount() {
        return this.equipmentCount;
    }

    public boolean getIsOpen() {
        return this.isOpen;
    }
}
