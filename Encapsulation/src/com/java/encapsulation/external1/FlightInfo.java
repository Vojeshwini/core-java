package com.java.encapsulation.external1;
import com.java.encapsulation.internal1.Jet;
import com.java.encapsulation.internal1.JetSpecs;



    public class FlightInfo {
        public void displayJetInfo() {
            Jet jet = new Jet();
            System.out.println("Jet Name: " + jet.getJetName());
            System.out.println("Jet Color: " + jet.getJetColor());
            System.out.println("Jet Speed: " + jet.getSpeed());
            System.out.println("Jet Capacity: " + jet.getCapacity());
        }

}
