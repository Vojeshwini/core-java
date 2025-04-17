package com.java.objects;
import com.java.objects.internal.Chocolate;
import com.java.objects.internal.Mouse;
import com.java.objects.internal.*;


public class objectsRunner {
    public static void main(String[] args){
        System.out.println("toString method");
        Chocolate choco=new Chocolate("Cadbury","gems",10,"Pack");
        System.out.println(choco);

        System.out.println("equals method");
        Chocolate cholcolate1=new Chocolate("Cadbury","Silk",160,"Oreo");
Chocolate cholcolate2=new Chocolate("Cadbury","Silk",160,"Oreo");
Chocolate cholcolate3=new Chocolate("Nestly","Milky bar",160,"Oreo");
//directly u can do or ref
System.out.println("Chocolate is Matching="+cholcolate1.equals(cholcolate2));
System.out.println("Chocolate is Matching="+cholcolate1.equals(cholcolate3));
System.out.println("---------------------------------------------------------------------------");
        System.out.println("to String");
        Mouse mou=new Mouse("Asus",500,"silver","India");
        System.out.println(mou);

        System.out.println("equals methods");
        Mouse mouse1=new Mouse("Asus",400,"silver","India");
        Mouse mouse2=new Mouse("Asus",400,"silver","India");
        Mouse mouse3=new Mouse("Asus",500,"gold","India");
        Mouse mouse4=new Mouse("hp",500,"silver","Korea");
        Mouse mouse5=new Mouse("Asus",500,"silver","Korea");
        boolean m1= mouse1.equals(mouse2);
        boolean m2= mouse1.equals(mouse3);
        boolean m3=mouse1.equals(mouse4);
        boolean m4=mouse1.equals(mouse5);
        System.out.println("m1 equal m2="+m1);
        System.out.println("m1 equal m3="+m2);
        System.out.println("m1 equal m4="+m3);
        System.out.println("m1 equal m5="+m4);
        System.out.println("----------------------------------------------------------------------");
        //to string
        Bag bag=new Bag("wildcraft","black","laptop bag",1200);
        System.out.println(bag);
        System.out.println("equals");
        Bag bag1=new Bag("wildcraft","black","laptop bag",1200);
        Bag bag2=new Bag("wildcraft","black","laptop bag",1200);
        Bag bag3=new Bag("skybags","white","luggage",1500);
        boolean b1=bag1.equals(bag2);
        boolean b2=bag1.equals(bag3);
        boolean b3=bag2.equals(bag3);
        System.out.println("bag1 and bag2 is matching?"+b1);
        System.out.println("bag1 and bag3 is matching?"+b2);
        System.out.println("bag2 and bag3 is matching?"+b3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("to String Mobile");
        Mobile mobile = new Mobile("Samsung", "Galaxy S22", 60000, "India");
        System.out.println(mobile);

        System.out.println("equals method for Mobile");
        Mobile mobile1 = new Mobile("Samsung", "Galaxy S22", 60000, "India");
        Mobile mobile2 = new Mobile("Samsung", "Galaxy S22", 60000, "India");
        Mobile mobile3 = new Mobile("Apple", "iPhone 14", 80000, "USA");

        boolean mob1 = mobile1.equals(mobile2);
        boolean mob2 = mobile1.equals(mobile3);

        System.out.println("mobile1 equals mobile2 isMatching? = " + mob1);
        System.out.println("mobile1 equals mobile3 isMatching? = " + mob2);

        System.out.println("------------------------------------------------------------------------");
        System.out.println("to String Pouch");
        Pouch pouch = new Pouch("Puma", "Black", "Leather", 300);
        System.out.println(pouch);

        System.out.println("equals method for Pouch");
        Pouch pouch1 = new Pouch("Puma", "Black", "Leather", 300);
        Pouch pouch2 = new Pouch("Puma", "Black", "Leather", 300);
        Pouch pouch3 = new Pouch("Nike", "Blue", "Canvas", 350);

        boolean p1 = pouch1.equals(pouch2);
        boolean p2 = pouch1.equals(pouch3);
        boolean p3 = pouch2.equals(pouch3);

        System.out.println("pouch1 and pouch2 isMatching? " + p1);
        System.out.println("pouch1 and pouch3 isMatching? " + p2);
        System.out.println("pouch2 and pouch3 isMatching? " + p3);
        System.out.println("----------------------------------------------------------------------");

        System.out.println("to String Clock");
        Clock clock = new Clock("Titan", "Wall", "White", 899.99);
        System.out.println(clock);

        System.out.println("equals method for Clock");
        Clock clock1 = new Clock("Titan", "Wall", "White", 899.99);
        Clock clock2 = new Clock("Titan", "Wall", "White", 899.99);
        Clock clock3 = new Clock("Casio", "Table", "Black", 1299.50);

        boolean c1 = clock1.equals(clock2);
        boolean c2 = clock1.equals(clock3);
        boolean c3 = clock2.equals(clock3);

        System.out.println("clock1 and clock2 isMatching? " + c1);
        System.out.println("clock1 and clock3 isMatching? " + c2);
        System.out.println("clock2 and clock3 isMatching? " + c3);
        System.out.println("-------------------------------------------------------------------");

        System.out.println("to String Shampoo");
        Shampoo shampoo = new Shampoo("Head & Shoulders", "Menthol", 180, 120.0);
        System.out.println(shampoo);

        System.out.println("equals method for Shampoo");
        Shampoo shampoo1 = new Shampoo("Head & Shoulders", "Menthol", 180, 120.0);
        Shampoo shampoo2 = new Shampoo("Head & Shoulders", "Menthol", 180, 120.0);
        Shampoo shampoo3 = new Shampoo("Dove", "Floral", 200, 140.0);

        boolean s1 = shampoo1.equals(shampoo2);
        boolean s2 = shampoo1.equals(shampoo3);
        boolean s3 = shampoo2.equals(shampoo3);

        System.out.println("shampoo1 and shampoo2 isMatching? " + s1);
        System.out.println("shampoo1 and shampoo3 isMatching? " + s2);
        System.out.println("shampoo2 and shampoo3 isMatching? " + s3);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("to String KeyBoard");
        KeyBoard keyboard = new KeyBoard("Logitech", "Mechanical", "Black", 2500);
        System.out.println(keyboard);

        System.out.println("equals method for KeyBoard");
        KeyBoard keyboard1 = new KeyBoard("Logitech", "Mechanical", "Black", 2500);
        KeyBoard keyboard2 = new KeyBoard("Logitech", "Mechanical", "Black", 2500);
        KeyBoard keyboard3 = new KeyBoard("HP", "Membrane", "White", 1500);

        boolean k1 = keyboard1.equals(keyboard2);
        boolean k2 = keyboard1.equals(keyboard3);
        boolean k3 = keyboard2.equals(keyboard3);

        System.out.println("keyboard1 and keyboard2 isMatching? " + k1);
        System.out.println("keyboard1 and keyboard3 isMatching? " + k2);
        System.out.println("keyboard2 and keyboard3 isMatching? " + k3);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("to String Juice");
        Juice juice = new Juice("Real", "Mango", 1000, 120.0);
        System.out.println(juice);

        System.out.println("equals method for Juice");
        Juice juice1 = new Juice("Real", "Mango", 1000, 120.0);
        Juice juice2 = new Juice("Real", "Mango", 1000, 120.0);
        Juice juice3 = new Juice("Tropicana", "Orange", 1000, 140.0);

        boolean j1 = juice1.equals(juice2);
        boolean j2 = juice1.equals(juice3);
        boolean j3 = juice2.equals(juice3);

        System.out.println("juice1 and juice2 isMatching? " + j1);
        System.out.println("juice1 and juice3 isMatching? " + j2);
        System.out.println("juice2 and juice3 isMatching? " + j3);
        System.out.println("-------------------------------------------");
        System.out.println("to String Chips");
        Chips chips = new Chips("Lays", "Magic Masala", 100, 20.0);
        System.out.println(chips);

        System.out.println("equals method for Chips");
        Chips chips1 = new Chips("Lays", "Magic Masala", 100, 20.0);
        Chips chips2 = new Chips("Lays", "Magic Masala", 100, 20.0);
        Chips chips3 = new Chips("Uncle Chips", "Plain Salted", 100, 18.0);

        boolean ch1 = chips1.equals(chips2);
        boolean ch2 = chips1.equals(chips3);
        boolean ch3 = chips2.equals(chips3);

        System.out.println("chips1 and chips2 isMatching? " + ch1);
        System.out.println("chips1 and chips3 isMatching? " + ch2);
        System.out.println("chips2 and chips3 isMatching? " + ch3);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("to String Salads");
        Salads salad = new Salads("Fruit", "Apple, Banana, Grapes", 200, 90.0);
        System.out.println(salad);

        System.out.println("equals method for Salads");
        Salads salad1 = new Salads("Fruit", "Apple, Banana, Grapes", 200, 90.0);
        Salads salad2 = new Salads("Fruit", "Apple, Banana, Grapes", 200, 90.0);
        Salads salad3 = new Salads("Veg", "Cucumber, Tomato, Lettuce", 250, 80.0);

        boolean sa1 = salad1.equals(salad2);
        boolean sa2 = salad1.equals(salad3);
        boolean sa3 = salad2.equals(salad3);

        System.out.println("salad1 and salad2 isMatching? " + sa1);
        System.out.println("salad1 and salad3 isMatching? " + sa2);
        System.out.println("salad2 and salad3 isMatching? " + sa3);
        System.out.println("------------------------------------------------------");









    }
}
