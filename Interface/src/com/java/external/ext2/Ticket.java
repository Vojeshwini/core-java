package com.java.external.ext2;

import com.java.internal.int2.Destination;

public class Ticket implements Destination {
    @Override
    public void yellowLine() {
        System.out.println("running the yellow line of metro in Ticket");
    }

    @Override
    public void purpleLine() {
        System.out.println("running the purpleLine of  the Source in the Ticket");
    }

    @Override
    public void lastStop() {
        System.out.println("running the laast stop of the Destination in the Ticket");
    }
}
