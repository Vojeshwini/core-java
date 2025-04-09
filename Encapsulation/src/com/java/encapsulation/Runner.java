package com.java.encapsulation;

import com.java.encapsulation.internal.Price;
import com.java.encapsulation.external.Tag;
import com.java.encapsulation.internal1.JetSpecs;
import com.java.encapsulation.external1.FlightInfo;




public class Runner {
    public static void main(String[] args) {
        Price p = new Price();
        p.run();
        Tag t = new Tag();
        t.badge();
        /*Jet*/

        JetSpecs j=new JetSpecs();
        j.showSpecs();

        FlightInfo a =new FlightInfo();
        a.displayJetInfo();


    }


}
