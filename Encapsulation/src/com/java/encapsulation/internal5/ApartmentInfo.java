package com.java.encapsulation.internal5;

public class ApartmentInfo {
    public ApartmentInfo() {
        System.out.println("Running ApartmentInfo");
    }

    public void showApartmentDetails() {
        Apartment apartment = new Apartment();
        System.out.println("Apartment Name: " + apartment.getApartmentName());
        System.out.println("Location: " + apartment.getLocation());
        System.out.println("Number of Flats: " + apartment.getNumberOfFlats());
        System.out.println("Has Lift: " + apartment.getHasLift());

        apartment.setApartmentName("Sky Tower");
        apartment.setLocation("Pune");
        apartment.setNumberOfFlats(200);
        apartment.setHasLift(false);

        System.out.println("Updated Apartment Name: " + apartment.getApartmentName());
        System.out.println("Updated Location: " + apartment.getLocation());
        System.out.println("Updated Number of Flats: " + apartment.getNumberOfFlats());
        System.out.println("Updated Has Lift: " + apartment.getHasLift());
    }
}
