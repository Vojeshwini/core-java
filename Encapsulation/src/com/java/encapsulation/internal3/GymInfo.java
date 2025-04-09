package com.java.encapsulation.internal3;

public class GymInfo {
    public GymInfo() {
        System.out.println("Running GymInfo");
    }

    public void showGymDetails() {
        Gym gym = new Gym();
        System.out.println("Gym Name: " + gym.getGymName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Equipment Count: " + gym.getEquipmentCount());
        System.out.println("Is Open: " + gym.getIsOpen());

        gym.setGymName("PowerHouse");
        gym.setLocation("Mumbai");
        gym.setEquipmentCount(70);
        gym.setIsOpen(false);

        System.out.println("Updated Gym Name: " + gym.getGymName());
        System.out.println("Updated Location: " + gym.getLocation());
        System.out.println("Updated Equipment Count: " + gym.getEquipmentCount());
        System.out.println("Updated Is Open: " + gym.getIsOpen());
    }
}
