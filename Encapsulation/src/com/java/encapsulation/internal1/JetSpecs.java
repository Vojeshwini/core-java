package com.java.encapsulation.internal1;

public class JetSpecs {
    public JetSpecs() {
        System.out.println("Running JetSpecs");
    }

    public void showSpecs() {
        Jet jet = new Jet();
        System.out.println("Jet Name: " + jet.getJetName());
        System.out.println("Jet Color: " + jet.getJetColor());
        System.out.println("Jet Speed: " + jet.getSpeed());
        System.out.println("Jet Capacity: " + jet.getCapacity());

        jet.setJetName("Raptor");
        jet.setJetColor("Black");
        jet.setSpeed(1500.0);
        jet.setCapacity(1);

        System.out.println("Updated Jet Name: " + jet.getJetName());
        System.out.println("Updated Jet Color: " + jet.getJetColor());
        System.out.println("Updated Jet Speed: " + jet.getSpeed());
        System.out.println("Updated Jet Capacity: " + jet.getCapacity());
    }
}
