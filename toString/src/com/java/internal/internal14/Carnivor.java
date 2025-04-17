package com.java.internal.internal14;

public class Carnivor extends Animal{
    public Carnivor(){
        super("cheetha","brown");
        System.out.println("running in the carnivor");
    }



    @Override
    public void domestic(){
        System.out.println("running the method in Carnivor ");
    }
    public void tiger(){
        System.out.println("running this in Carnivor");
    }
}
