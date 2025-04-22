package com.java.runner;

import com.java.external.*;
import com.java.external.ext1.EveryDay;
import com.java.external.ext2.Ticket;
import com.java.external.ext3.Hand;
import com.java.external.ext5.Voltage;
import com.java.external.ext7.Stem;
import com.java.external.ext8.HandBag;
import com.java.external.ext9.StoryBook;
import com.java.internal.*;
import com.java.internal.int1.*;
import com.java.internal.int2.Destination;
import com.java.internal.int3.SpinalCord;
import com.java.internal.int4.Color;
import com.java.external.ext4.Time;
import com.java.internal.int5.PowerLine;
import com.java.internal.int6.Flow;
import com.java.external.ext6.Dam;
import com.java.external.ext7.Stem;
import com.java.internal.int7.*;
import com.java.internal.int8.*;
import com.java.external.ext8.*;
import com.java.internal.int9.Brand;


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
        SpinalCord spinal=new Hand();
        spinal.boneMorrow();
        spinal.brain();
        System.out.println("--------------------------------------------------");
        Color color=new Time();
        color.green();
        color.number();
        System.out.println("-------------------------------------------------------");
        PowerLine powerLine=new Voltage();
        powerLine.kb();
        powerLine.current();
        powerLine.wire();
        Voltage voltage=new Voltage();
        voltage.speed();
        voltage.kb();
        voltage.wire();
        voltage.current();
        System.out.println("-------------------------------------------------------------------------------");
       Dam dam =new Dam();
       dam.riverKaveri();
       dam.talaKaveri();
       Flow flow =new Dam();
       flow.talaKaveri();
       flow.riverKaveri();
        System.out.println("-----------------------------------------------------------------------------------");
       Root root= new Stem();
       root.primaryRoot();
       root.flower();
       Stem stem=new Stem();
       stem.flower();
       stem.primaryRoot();
        System.out.println("------------------------------------------------------------------------");
       Bag bag=new HandBag();
       bag.brand();
       bag.price();
       bag.color();
       bag.pouch();
       bag.steel();
       bag.size();
       HandBag handBag=new HandBag();
       handBag.brand();
       handBag.pouch();
       handBag.color();
       handBag.size();
       handBag.steel();
       handBag.price();
       System.out.println("-------------------------------------------------------------");
        StoryBook storyBook=new StoryBook();
        storyBook.classMate();
        storyBook.nataraj();
        storyBook.pages();
        storyBook.ruled();
        storyBook.unRuled();
        storyBook.speed();
        Brand brand=new StoryBook();
        brand.classMate();
        brand.nataraj();
        brand.pages();
        brand.ruled();
        brand.unRuled();
        brand.speed();
        System.out.println("----------------------------------------------------");
        Railway railway=new Source();
        railway.coach();
        railway.flag();
        railway.signal();
        railway.track();
        railway.seat();
        Source source=new Source();
        source.coach();
        source.flag();
        source.signal();
        source.track();
        source.seat();
        System.out.println("-------------------------------------------------");
        Kite kite = new Fly();
        kite.fly();
        kite.thread();
        kite.paper();
        kite.color();
        kite.tail();

        Fly fly = new Fly();
        fly.fly();
        fly.thread();
        fly.paper();
        fly.color();
        fly.tail();
        System.out.println("-------------------------------------------------");

            Shirt shirt = new Wear();
            shirt.collar();
            shirt.sleeve();
            shirt.button();
            shirt.pocket();
            shirt.fabric();

            Wear wear = new Wear();
            wear.collar();
            wear.sleeve();
            wear.button();
            wear.pocket();
            wear.fabric();

            System.out.println("-------------------------------------------------");





    }
}
