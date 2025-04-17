package com.java.internal.internal14;

public class Animal {
    private String name;
    private String color;

public Animal(String name,String color){
        System.out.println("running animal in constructor");
        this.name=name;
        this.color=color;
    }


    public void domestic() {
        System.out.println("running the methos in animals");
    }

   @Override
           public String toString() {
       System.out.println("overriding the toString");
       super.toString();
       return "name="+name+"color="+color;
   }


}
