package com.java.external;
import com.java.internal.*;

public class Network implements Range{
    @Override
    public void jio() {
        System.out.println("running the jio inn network");
    }

    @Override
    public void sim() {
        System.out.println("running the sim in network");
    }
}
