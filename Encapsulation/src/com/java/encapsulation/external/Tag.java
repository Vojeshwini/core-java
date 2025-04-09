package com.java.encapsulation.external;
import com.java.encapsulation.internal.*;
public class Tag {
    public void badge(){
        Badge bd=new Badge();
        System.out.println("Name:"+bd.getBadgeName());
        System.out.println("Name:"+bd.getColor());
        System.out.println("Name:"+bd.getPrice());
        System.out.println("Name:"+bd.getQuantity());
    }

}
