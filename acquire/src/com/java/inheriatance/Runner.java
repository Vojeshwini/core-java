package com.java.inheriatance;
import com.java.inheriatance.external1.*;
import com.java.inheriatance.external4.Actor;
import com.java.inheriatance.external6.Cactus;
import com.java.inheriatance.internal1.*;
import com.java.inheriatance.internal2.*;
import com.java.inheriatance.external2.*;
import com.java.inheriatance.internal3.*;
import com.java.inheriatance.external3.*;
import com.java.inheriatance.internal4.Human;
import com.java.inheriatance.internal4.Person;
import com.java.inheriatance.internal5.*;
import com.java.inheriatance.external5.*;
import com.java.inheriatance.internal6.*;
import com.java.inheriatance.external6.*;


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
        System.out.println("-----------------------------------------------------------------------------------------------------");
        Dish dish=new Dish();
        Dish dish1=new SideDish();
        Dish dish2=new Omlet();
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        Human hman=new Human();
        Human human1=new Person();
        Human human2=new Actor();
        System.out.println("---------------------------------------------------------------------------");
        Tool tool= new Tool();
        Tool tool1=new Revolver();
        Tool tool2=new Weapon();
        System.out.println("--------------------------------------------------------------------------");
        Thing cactus=new Thing();
        Thing cactus1=new Plant();
        Thing cactus2=new Cactus();


    }
}
