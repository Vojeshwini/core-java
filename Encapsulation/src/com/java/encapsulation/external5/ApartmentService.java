package com.java.encapsulation.external5;
import com.java.encapsulation.internal5.Apartment;

public class ApartmentService {
    public void displayApartment() {
        Apartment apartment = new Apartment();
        System.out.println("Apartment Name: " + apartment.getApartmentName());
        System.out.println("Location: " + apartment.getLocation());
        System.out.println("Number of Flats: " + apartment.getNumberOfFlats());
        System.out.println("Has Lift: " + apartment.getHasLift());
    }
}
