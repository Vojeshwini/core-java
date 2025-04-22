package com.java.runner;

import com.java.external.*;
import com.java.external.ext1.EveryDay;
import com.java.external.ext2.Ticket;
import com.java.internal.*;
import com.java.internal.int1.*;
import com.java.internal.int2.Destination;


public class runner {
    public static void main(String[] args){
        Law law=new Article();
        law.rule();
        System.out.println("------------------------------------------------------");
        Range range=new Network();
        range.jio();
        range.sim();
        System.out.println("-----------------------------------------------------------");
        Laptop laptop=new EveryDay();
        laptop.mobile();
        laptop.battery();
        EveryDay everyDay=new EveryDay();
        everyDay.battery();
        everyDay.mobile();
        Charger charger=new EveryDay();
        charger.mobile();
        System.out.println("------------------------------------------------------------");
        Destination destination=new Ticket();
        destination.lastStop();
        destination.purpleLine();
        destination.yellowLine();
        Ticket ticket=new Ticket();
        ticket.lastStop();
        ticket.yellowLine();
        ticket.purpleLine();
        System.out.println("---------------------------------------------------------------");
    }
}
