package com.java.encapsulation.internal2;

public class OccupationInfo {
    public OccupationInfo() {
        System.out.println("Running OccupationInfo");
    }

    public void show() {
        Occupation occupation = new Occupation();
        System.out.println("Occupation: " + occupation.getOccupationName());
        System.out.println("Field: " + occupation.getField());
        System.out.println("Experience: " + occupation.getExperience());
        System.out.println("Salary: " + occupation.getSalary());

        occupation.setOccupationName("Doctor");
        occupation.setField("Medicine");
        occupation.setExperience(10);
        occupation.setSalary(120000.0);

        System.out.println("Updated Occupation: " + occupation.getOccupationName());
        System.out.println("Updated Field: " + occupation.getField());
        System.out.println("Updated Experience: " + occupation.getExperience());
        System.out.println("Updated Salary: " + occupation.getSalary());
    }

}
