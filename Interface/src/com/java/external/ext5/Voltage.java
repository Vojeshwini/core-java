package com.java.external.ext5;

import com.java.internal.int5.PowerLine;

public class Voltage implements PowerLine {
    @Override
    public void current() {
        System.out.println("running the current in the voltage");
    }

    @Override
    public void kb() {
        System.out.println("runnig the kb in the voltage");
    }

    @Override
    public void wire() {
        System.out.println("running the wire in the voltage");
    }
    public void speed(){
        System.out.println("runnin  the speed");
    }

}
