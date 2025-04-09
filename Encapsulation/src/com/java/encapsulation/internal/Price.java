package com.java.encapsulation.internal;

public class Price {
public Price(){
    System.out.println("Running the details");
}
public void run(){
    Badge bd=new Badge();
    System.out.println("Name:"+bd.getBadgeName());
    System.out.println("Name:"+bd.getColor());
    System.out.println("Name:"+bd.getPrice());
    System.out.println("Name:"+bd.getQuantity());

    bd.setBadgeName("kvg");
    bd.setColor("white and black");
    bd.setPrice("3");
    bd.setQuantity(5);

    System.out.println("Name:"+bd.getBadgeName());
    System.out.println("Name:"+bd.getColor());
    System.out.println("Name:"+bd.getPrice());
    System.out.println("Name:"+bd.getQuantity());


}

}
