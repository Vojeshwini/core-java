package com.java.external.ext1;
import com.java.internal.int1.*;
import com.java.internal.int1.Charger;
import com.java.internal.int1.Laptop;

public class EveryDay implements Laptop{
    @Override
    public void battery() {
        System.out.println("runnign the battery in Everyday");

    }
    public void mobile(){
        System.out.println("running the mobile in the Everyday");
    }


}
