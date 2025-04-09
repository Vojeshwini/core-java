package com.java.encapsulation.internal;

public class Badge {
    private String badgeName="KVG";
    private String color="white and blue";
    private String price="2 Rs";
    private int quantity=10;


public Badge(){
    System.out.println("Running the badge");

}

public void setBadgeName(String badgeName){
    this.badgeName=badgeName;

}
    public void setColor(String color){
        this.color=color;
    }

    public void setPrice(String price){
    this.price=price;
    }

    public void setQuantity(int quantity){
    this.quantity=quantity;
    }

    public String getBadgeName(){
    return this.badgeName;
    }
    public String getColor(){
    return this.color;
    }
    public String getPrice(){
    return this.price;
    }
    public int getQuantity(){
    return this.quantity;
    }

}
