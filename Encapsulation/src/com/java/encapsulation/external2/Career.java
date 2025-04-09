package com.java.encapsulation.external2;

import com.java.encapsulation.internal2.Occupation;

public class Career {
    public void displayOccupation() {
        Occupation occupation = new Occupation();
        System.out.println("Occupation: " + occupation.getOccupationName());
        System.out.println("Field: " + occupation.getField());
        System.out.println("Experience: " + occupation.getExperience());
        System.out.println("Salary: " + occupation.getSalary());
    }
}
