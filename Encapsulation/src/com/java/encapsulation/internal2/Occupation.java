package com.java.encapsulation.internal2;

public class Occupation {
    private String occupationName = "Engineer";
    private String field = "Software";
    private int experience = 5;
    private double salary = 75000.0;

    public Occupation() {
        System.out.println("Running the Occupation");
    }


    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getOccupationName() {
        return this.occupationName;
    }

    public String getField() {
        return this.field;
    }

    public int getExperience() {
        return this.experience;
    }

    public double getSalary() {
        return this.salary;
    }
}