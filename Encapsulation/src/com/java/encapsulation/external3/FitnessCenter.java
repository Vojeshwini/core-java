package com.java.encapsulation.external3;

import com.java.encapsulation.internal3.*;

public class FitnessCenter {
    public void displayGym() {
        Gym gym = new Gym();
        System.out.println("Gym Name: " + gym.getGymName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Equipment Count: " + gym.getEquipmentCount());
        System.out.println("Is Open: " + gym.getIsOpen());
    }
}
