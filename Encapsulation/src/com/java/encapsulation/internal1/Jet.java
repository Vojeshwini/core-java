package com.java.encapsulation.internal1;

public class Jet {
    private String jetName = "Falcon";
    private String jetColor = "Grey";
    private double speed = 900.5; // in km/h
    private int capacity = 2; // number of people

    public Jet() {
        System.out.println("Running the Jet");
    }

    public void setJetName(String jetName) {
        this.jetName = jetName;
    }

    public void setJetColor(String jetColor) {
        this.jetColor = jetColor;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getJetName() {
        return this.jetName;
    }

    public String getJetColor() {
        return this.jetColor;
    }

    public double getSpeed() {
        return this.speed;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
