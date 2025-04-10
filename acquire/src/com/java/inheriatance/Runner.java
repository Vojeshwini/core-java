package com.java.inheriatance;
import com.java.inheriatance.external1.*;
import com.java.inheriatance.internal1.*;
import com.java.inheriatance.internal2.*;
import com.java.inheriatance.external2.*;



public class Runner {
    public static void main(String[] args){
        Food food =new Food();
        Food food1=new Snack();
        Food food2=new  Biscuit();
        Food food3=new GoodDayBiscuit();
        System.out.println("-----------------------------------------------------------------------------------");
        Organization organization=new Organization();
        Organization organization1=new Academy();
        Organization organization2=new Tap();
    }
}
