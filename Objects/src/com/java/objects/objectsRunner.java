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

        System.out.println("to String Drum");
        Drum drum = new Drum("Yamaha", "Bass", "Wood", 5500.0);
        System.out.println(drum);

        System.out.println("equals method for Drum");
        Drum drum1 = new Drum("Yamaha", "Bass", "Wood", 5500.0);
        Drum drum2 = new Drum("Yamaha", "Bass", "Wood", 5500.0);
        Drum drum3 = new Drum("Pearl", "Snare", "Metal", 4000.0);

        boolean d1 = drum1.equals(drum2);
        boolean d2 = drum1.equals(drum3);
        boolean d3 = drum2.equals(drum3);

        System.out.println("drum1 and drum2 isMatching? " + d1);
        System.out.println("drum1 and drum3 isMatching? " + d2);
        System.out.println("drum2 and drum3 isMatching? " + d3);
        System.out.println("------------------------------------------------");
        System.out.println("to String Earpod");
        Earpod earpod = new Earpod("Apple", "AirPods Pro", "White", 24999.0);
        System.out.println(earpod);

        System.out.println("equals method for Earpod");
        Earpod earpod1 = new Earpod("Apple", "AirPods Pro", "White", 24999.0);
        Earpod earpod2 = new Earpod("Apple", "AirPods Pro", "White", 24999.0);
        Earpod earpod3 = new Earpod("boAt", "Airdopes 441", "Black", 1999.0);

        boolean e1 = earpod1.equals(earpod2);
        boolean e2 = earpod1.equals(earpod3);
        boolean e3 = earpod2.equals(earpod3);

        System.out.println("earpod1 and earpod2 isMatching? " + e1);
        System.out.println("earpod1 and earpod3 isMatching? " + e2);
        System.out.println("earpod2 and earpod3 isMatching? " + e3);
        System.out.println("-------------------------------------------------------------");
        System.out.println("to String Gun");
        Gun gun = new Gun("Smith & Wesson", "M&P15", "Rifle", 75000.0);
        System.out.println(gun);

        System.out.println("equals method for Gun");
        Gun gun1 = new Gun("Smith & Wesson", "M&P15", "Rifle", 75000.0);
        Gun gun2 = new Gun("Smith & Wesson", "M&P15", "Rifle", 75000.0);
        Gun gun3 = new Gun("Glock", "17", "Pistol", 45000.0);

        boolean g1 = gun1.equals(gun2);
        boolean g2 = gun1.equals(gun3);
        boolean g3 = gun2.equals(gun3);

        System.out.println("gun1 and gun2 isMatching? " + g1);
        System.out.println("gun1 and gun3 isMatching? " + g2);
        System.out.println("gun2 and gun3 isMatching? " + g3);

        System.out.println("------------------------------------------------");

        System.out.println("to String Doll");
        Doll doll = new Doll("Barbie", "Plastic", "Pink", 499.0);
        System.out.println(doll);

        System.out.println("equals method for Doll");
        Doll doll1 = new Doll("Barbie", "Plastic", "Pink", 499.0);
        Doll doll2 = new Doll("Barbie", "Plastic", "Pink", 499.0);
        Doll doll3 = new Doll("Chhota Bheem", "Cloth", "Orange", 399.0);

        boolean do1 = doll1.equals(doll2);
        boolean do2 = doll1.equals(doll3);
        boolean do3 = doll2.equals(doll3);

        System.out.println("doll1 and doll2 isMatching? " + do1);
        System.out.println("doll1 and doll3 isMatching? " + do2);
        System.out.println("doll2 and doll3 isMatching? " + do3);
        System.out.println("------------------------------------------");
        System.out.println("to String Money");
        Money money = new Money("INR", "India", 500, 500.0);
        System.out.println(money);

        System.out.println("equals method for Money");
        Money money1 = new Money("INR", "India", 500, 500.0);
        Money money2 = new Money("INR", "India", 500, 500.0);
        Money money3 = new Money("USD", "USA", 100, 100.0);

        boolean mo1 = money1.equals(money2);
        boolean mo2 = money1.equals(money3);
        boolean mo3 = money2.equals(money3);

        System.out.println("money1 and money2 isMatching? " + mo1);
        System.out.println("money1 and money3 isMatching? " + mo2);
        System.out.println("money2 and money3 isMatching? " + mo3);
        System.out.println("----------------------------------------------------------------");
        System.out.println("to String Van");
        Van van = new Van("Tata", "Winger", "White", 850000.0);
        System.out.println(van);

        System.out.println("equals method for Van");
        Van van1 = new Van("Tata", "Winger", "White", 850000.0);
        Van van2 = new Van("Tata", "Winger", "White", 850000.0);
        Van van3 = new Van("Force", "Traveller", "Silver", 900000.0);

        boolean v1 = van1.equals(van2);
        boolean v2 = van1.equals(van3);
        boolean v3 = van2.equals(van3);

        System.out.println("van1 and van2 isMatching? " + v1);
        System.out.println("van1 and van3 isMatching? " + v2);
        System.out.println("van2 and van3 isMatching? " + v3);
        System.out.println("----------------------------------------");
        System.out.println("to String Zoo");
        Zoo zoo = new Zoo("Mysore Zoo", "Karnataka", 1450, 100.0);
        System.out.println(zoo);

        System.out.println("equals method for Zoo");
        Zoo zoo1 = new Zoo("Mysore Zoo", "Karnataka", 1450, 100.0);
        Zoo zoo2 = new Zoo("Mysore Zoo", "Karnataka", 1450, 100.0);
        Zoo zoo3 = new Zoo("Nehru Zoological Park", "Hyderabad", 1200, 80.0);

        boolean z1 = zoo1.equals(zoo2);
        boolean z2 = zoo1.equals(zoo3);
        boolean z3 = zoo2.equals(zoo3);

        System.out.println("zoo1 and zoo2 isMatching? " + z1);
        System.out.println("zoo1 and zoo3 isMatching? " + z2);
        System.out.println("zoo2 and zoo3 isMatching? " + z3);
        System.out.println("----------------------------------");
        System.out.println("to String Syrup");
        Syrup syrup = new Syrup("Dabur", "Honey", 250, 150.0);
        System.out.println(syrup);

        System.out.println("equals method for Syrup");
        Syrup syrup1 = new Syrup("Dabur", "Honey", 250, 150.0);
        Syrup syrup2 = new Syrup("Dabur", "Honey", 250, 150.0);
        Syrup syrup3 = new Syrup("Zandu", "Tulsi", 200, 130.0);

        boolean sy1 = syrup1.equals(syrup2);
        boolean sy2 = syrup1.equals(syrup3);
        boolean sy3 = syrup2.equals(syrup3);

        System.out.println("syrup1 and syrup2 isMatching? " + sy1);
        System.out.println("syrup1 and syrup3 isMatching? " + sy2);
        System.out.println("syrup2 and syrup3 isMatching? " + sy3);
        System.out.println("----------------------------------------------------");
        System.out.println("to String");
        Parachut parachut = new Parachut("Nylon", "Red", 120, 5000.0);
        System.out.println(parachut);

        System.out.println("equals");
        Parachut parachut1 = new Parachut("Nylon", "Red", 120, 5000.0);
        Parachut parachut2 = new Parachut("Nylon", "Red", 120, 5000.0);
        Parachut parachut3 = new Parachut("Polyester", "Blue", 100, 4500.0);

        boolean pa1 = parachut1.equals(parachut2);
        boolean pa2 = parachut1.equals(parachut3);
        boolean pa3 = parachut2.equals(parachut3);

        System.out.println("parachut1 and parachut2 isMatching? " + pa1);
        System.out.println("parachut1 and parachut3 isMatching? " + pa2);
        System.out.println("parachut2 and parachut3 isMatching? " + pa3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("to String");
        Jug jug = new Jug("Glass", "Transparent", 5, 250.0);
        System.out.println(jug);

        System.out.println("equals");
        Jug jug1 = new Jug("Glass", "Transparent", 5, 250.0);
        Jug jug2 = new Jug("Glass", "Transparent", 5, 250.0);
        Jug jug3 = new Jug("Plastic", "Blue", 3, 150.0);

        boolean ju1 = jug1.equals(jug2);
        boolean ju2 = jug1.equals(jug3);
        boolean ju3 = jug2.equals(jug3);

        System.out.println("jug1 and jug2 isMatching? " + ju1);
        System.out.println("jug1 and jug3 isMatching? " + ju2);
        System.out.println("jug2 and jug3 isMatching? " + ju3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("to String");
        Nest nest = new Nest("Twigs", "Medium", 3, 150.0);
        System.out.println(nest);

        System.out.println("equals");
        Nest nest1 = new Nest("Twigs", "Medium", 3, 150.0);
        Nest nest2 = new Nest("Twigs", "Medium", 3, 150.0);
        Nest nest3 = new Nest("Grass", "Large", 4, 200.0);

        boolean n1 = nest1.equals(nest2);
        boolean n2 = nest1.equals(nest3);
        boolean n3 = nest2.equals(nest3);

        System.out.println("nest1 and nest2 isMatching? " + n1);
        System.out.println("nest1 and nest3 isMatching? " + n2);
        System.out.println("nest2 and nest3 isMatching? " + n3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("to String");
        Router router = new Router("TP-Link", "Archer C6", "Black", 2499.0);
        System.out.println(router);

        System.out.println("equals");
        Router router1 = new Router("TP-Link", "Archer C6", "Black", 2499.0);
        Router router2 = new Router("TP-Link", "Archer C6", "Black", 2499.0);
        Router router3 = new Router("Netgear", "R6120", "White", 2999.0);

        boolean r1 = router1.equals(router2);
        boolean r2 = router1.equals(router3);
        boolean r3 = router2.equals(router3);

        System.out.println("router1 and router2 isMatching? " + r1);
        System.out.println("router1 and router3 isMatching? " + r2);
        System.out.println("router2 and router3 isMatching? " + r3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("to String");
        Umbrella umbrella = new Umbrella("Rein", "Blue", "Nylon", 350.0);
        System.out.println(umbrella);

        System.out.println("equals");
        Umbrella umbrella1 = new Umbrella("Rein", "Blue", "Nylon", 350.0);
        Umbrella umbrella2 = new Umbrella("Rein", "Blue", "Nylon", 350.0);
        Umbrella umbrella3 = new Umbrella("Wildcraft", "Red", "Polyester", 450.0);

        boolean u1 = umbrella1.equals(umbrella2);
        boolean u2 = umbrella1.equals(umbrella3);
        boolean u3 = umbrella2.equals(umbrella3);

        System.out.println("umbrella1 and umbrella2 isMatching? " + u1);
        System.out.println("umbrella1 and umbrella3 isMatching? " + u2);
        System.out.println("umbrella2 and umbrella3 isMatching? " + u3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("to String");
        Yogut yogut = new Yogut("Strawberry", "Amul", 200, 50.0);
        System.out.println(yogut);

        System.out.println("equals");
        Yogut yogut1 = new Yogut("Strawberry", "Amul", 200, 50.0);
        Yogut yogut2 = new Yogut("Strawberry", "Amul", 200, 50.0);
        Yogut yogut3 = new Yogut("Vanilla", "Mother Dairy", 150, 45.0);

        boolean y1 = yogut1.equals(yogut2);
        boolean y2 = yogut1.equals(yogut3);
        boolean y3 = yogut2.equals(yogut3);

        System.out.println("yogut1 and yogut2 isMatching? " + y1);
        System.out.println("yogut1 and yogut3 isMatching? " + y2);
        System.out.println("yogut2 and yogut3 isMatching? " + y3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("to String");
        ToothBrush toothbrush = new ToothBrush("Oral-B", "White", "Electric", 799.0);
        System.out.println(toothbrush);

        System.out.println("equals");
        ToothBrush toothbrush1 = new ToothBrush("Oral-B", "White", "Electric", 799.0);
        ToothBrush toothbrush2 = new ToothBrush("Oral-B", "White", "Electric", 799.0);
        ToothBrush toothbrush3 = new ToothBrush("Colgate", "Blue", "Manual", 150.0);

        boolean t1 = toothbrush1.equals(toothbrush2);
        boolean t2 = toothbrush1.equals(toothbrush3);
        boolean t3 = toothbrush2.equals(toothbrush3);

        System.out.println("toothbrush1 and toothbrush2 isMatching? " + t1);
        System.out.println("toothbrush1 and toothbrush3 isMatching? " + t2);
        System.out.println("toothbrush2 and toothbrush3 isMatching? " + t3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("**********************************************************************");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("using setter");
        System.out.println("toString");

        CupBoard cupBoard=new CupBoard();
        cupBoard.setBrand("godrej");
        cupBoard.setType("Single Door");
        cupBoard.setColor("Maroon");
        cupBoard.setPrice(12000);
        System.out.println(cupBoard);
        System.out.println("Equals method");

        CupBoard cupBoard1=new CupBoard();
        cupBoard1.setBrand("Caspian");
        cupBoard1.setType("Single door");
        cupBoard1.setColor("Army green");
        cupBoard1.setPrice(16000);

        CupBoard cupBoard2=new CupBoard();
        cupBoard2.setBrand("Caspian");
        cupBoard2.setType("Single door");
        cupBoard2.setColor("Army green");
        cupBoard2.setPrice(16000);

        CupBoard cupBoard3=new CupBoard();
        cupBoard3.setBrand("Godrej");
        cupBoard3.setType("Wooden");
        cupBoard3.setColor("Wood");
        cupBoard3.setPrice(17000);

        boolean cup1=cupBoard1.equals(cupBoard2);
        boolean cup2=cupBoard1.equals(cupBoard3);
        boolean cup3=cupBoard2.equals(cupBoard3);
        System.out.println("cupboard1 and cupboard2 isMatching? " + cup1);
        System.out.println("cupboard1 and cupboard3 isMatching? " + cup2);
        System.out.println("cupboard2 and cupboard3 isMatching? " + cup3);
            System.out.println("-----------------------------------------------------------");

            System.out.println("using setter");
            System.out.println("toString");

            Pen pen = new Pen();
            pen.setBrand("Reynolds");
            pen.setColor("Blue");
            pen.setType("Gel");
            pen.setPrice(10);
            System.out.println(pen);

            System.out.println("Equals method");

            Pen pen1 = new Pen();
            pen1.setBrand("Parker");
            pen1.setColor("Black");
            pen1.setType("Ball");
            pen1.setPrice(150);

            Pen pen2 = new Pen();
            pen2.setBrand("Parker");
            pen2.setColor("Black");
            pen2.setType("Ball");
            pen2.setPrice(150);

            Pen pen3 = new Pen();
            pen3.setBrand("Cello");
            pen3.setColor("Red");
            pen3.setType("Gel");
            pen3.setPrice(15);

            boolean pe1 = pen1.equals(pen2);
            boolean pe2 = pen1.equals(pen3);
            boolean pe3 = pen2.equals(pen3);
            System.out.println("pen1 and pen2 isMatching? " + pe1);
            System.out.println("pen1 and pen3 isMatching? " + pe2);
            System.out.println("pen2 and pen3 isMatching? " + pe3);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("using setter");
            System.out.println("toString");

            Parrot parrot = new Parrot();
            parrot.setSpecies("Macaw");
            parrot.setColor("Blue and Yellow");
            parrot.setAge(3);
            parrot.setOrigin("Brazil");
            System.out.println(parrot);

            System.out.println("Equals method");

            Parrot parrot1 = new Parrot();
            parrot1.setSpecies("African Grey");
            parrot1.setColor("Grey");
            parrot1.setAge(4);
            parrot1.setOrigin("Africa");

            Parrot parrot2 = new Parrot();
            parrot2.setSpecies("African Grey");
            parrot2.setColor("Grey");
            parrot2.setAge(4);
            parrot2.setOrigin("Africa");

            Parrot parrot3 = new Parrot();
            parrot3.setSpecies("Cockatoo");
            parrot3.setColor("White");
            parrot3.setAge(5);
            parrot3.setOrigin("Australia");

            boolean pr1 = parrot1.equals(parrot2);
            boolean pr2 = parrot1.equals(parrot3);
            boolean pr3 = parrot2.equals(parrot3);
            System.out.println("parrot1 and parrot2 isMatching? " + pr1);
            System.out.println("parrot1 and parrot3 isMatching? " + pr2);
            System.out.println("parrot2 and parrot3 isMatching? " + pr3);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("using setter");
            System.out.println("toString");

            Bulb bulb = new Bulb();
            bulb.setBrand("Philips");
            bulb.setType("LED");
            bulb.setWattage(9);
            bulb.setPrice(150);
            System.out.println(bulb);

            System.out.println("Equals method");

            Bulb bulb1 = new Bulb();
            bulb1.setBrand("Syska");
            bulb1.setType("LED");
            bulb1.setWattage(12);
            bulb1.setPrice(180);

            Bulb bulb2 = new Bulb();
            bulb2.setBrand("Syska");
            bulb2.setType("LED");
            bulb2.setWattage(12);
            bulb2.setPrice(180);

            Bulb bulb3 = new Bulb();
            bulb3.setBrand("Wipro");
            bulb3.setType("CFL");
            bulb3.setWattage(15);
            bulb3.setPrice(120);

            boolean bu1 = bulb1.equals(bulb2);
            boolean bu2 = bulb1.equals(bulb3);
            boolean bu3 = bulb2.equals(bulb3);
            System.out.println("bulb1 and bulb2 isMatching? " + bu1);
            System.out.println("bulb1 and bulb3 isMatching? " + bu2);
            System.out.println("bulb2 and bulb3 isMatching? " + bu3);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("using setter");
            System.out.println("toString");

            HairBand hairBand = new HairBand();
            hairBand.setBrand("Zara");
            hairBand.setColor("Black");
            hairBand.setMaterial("Velvet");
            hairBand.setPrice(99.0);
            System.out.println(hairBand);

            System.out.println("Equals method");

            HairBand hairBand1 = new HairBand();
            hairBand1.setBrand("H&M");
            hairBand1.setColor("Pink");
            hairBand1.setMaterial("Satin");
            hairBand1.setPrice(120.0);

            HairBand hairBand2 = new HairBand();
            hairBand2.setBrand("H&M");
            hairBand2.setColor("Pink");
            hairBand2.setMaterial("Satin");
            hairBand2.setPrice(120.0);

            HairBand hairBand3 = new HairBand();
            hairBand3.setBrand("Forever21");
            hairBand3.setColor("Red");
            hairBand3.setMaterial("Cotton");
            hairBand3.setPrice(80.0);

            boolean h1 = hairBand1.equals(hairBand2);
            boolean h2 = hairBand1.equals(hairBand3);
            boolean h3 = hairBand2.equals(hairBand3);
            System.out.println("hairBand1 and hairBand2 isMatching? " + h1);
            System.out.println("hairBand1 and hairBand3 isMatching? " + h2);
            System.out.println("hairBand2 and hairBand3 isMatching? " + h3);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("using setter");
            System.out.println("toString");

            Lamp lamp = new Lamp();
            lamp.setBrand("Philips");
            lamp.setType("Table Lamp");
            lamp.setColor("White");
            lamp.setPrice(850.0);
            System.out.println(lamp);

            System.out.println("Equals method");

            Lamp lamp1 = new Lamp();
            lamp1.setBrand("Wipro");
            lamp1.setType("Wall Lamp");
            lamp1.setColor("Yellow");
            lamp1.setPrice(1200.0);

            Lamp lamp2 = new Lamp();
            lamp2.setBrand("Wipro");
            lamp2.setType("Wall Lamp");
            lamp2.setColor("Yellow");
            lamp2.setPrice(1200.0);

            Lamp lamp3 = new Lamp();
            lamp3.setBrand("Syska");
            lamp3.setType("Ceiling Lamp");
            lamp3.setColor("Warm White");
            lamp3.setPrice(1500.0);

            boolean l1 = lamp1.equals(lamp2);
            boolean l2 = lamp1.equals(lamp3);
            boolean l3 = lamp2.equals(lamp3);
            System.out.println("lamp1 and lamp2 isMatching? " + l1);
            System.out.println("lamp1 and lamp3 isMatching? " + l2);
            System.out.println("lamp2 and lamp3 isMatching? " + l3);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("using setter");
            System.out.println("toString");

            Xerox xerox = new Xerox();
            xerox.setBrand("Canon");
            xerox.setModel("C-500");
            xerox.setColorType("Color");
            xerox.setPrice(25000.0);
            System.out.println(xerox);

            System.out.println("Equals method");

            Xerox xerox1 = new Xerox();
            xerox1.setBrand("HP");
            xerox1.setModel("HP-Laser");
            xerox1.setColorType("B&W");
            xerox1.setPrice(20000.0);

            Xerox xerox2 = new Xerox();
            xerox2.setBrand("HP");
            xerox2.setModel("HP-Laser");
            xerox2.setColorType("B&W");
            xerox2.setPrice(20000.0);

            Xerox xerox3 = new Xerox();
            xerox3.setBrand("Epson");
            xerox3.setModel("EcoTank");
            xerox3.setColorType("Color");
            xerox3.setPrice(30000.0);

            boolean x1 = xerox1.equals(xerox2);
            boolean x2 = xerox1.equals(xerox3);
            boolean x3 = xerox2.equals(xerox3);
            System.out.println("xerox1 and xerox2 isMatching? " + x1);
            System.out.println("xerox1 and xerox3 isMatching? " + x2);
            System.out.println("xerox2 and xerox3 isMatching? " + x3);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("using setter");
            System.out.println("toString");

            KeyChain keyChain = new KeyChain();
            keyChain.setMaker("WildHorn");
            keyChain.setBuildMaterial("Leather");
            keyChain.setDesign("Rectangle");
            keyChain.setCost(150.0);
            System.out.println(keyChain);

            System.out.println("Equals method");

            KeyChain keyChain1 = new KeyChain();
            keyChain1.setMaker("Skyline");
            keyChain1.setBuildMaterial("Metal");
            keyChain1.setDesign("Round");
            keyChain1.setCost(100.0);

            KeyChain keyChain2 = new KeyChain();
            keyChain2.setMaker("Skyline");
            keyChain2.setBuildMaterial("Metal");
            keyChain2.setDesign("Round");
            keyChain2.setCost(100.0);

            KeyChain keyChain3 = new KeyChain();
            keyChain3.setMaker("Fastrack");
            keyChain3.setBuildMaterial("Plastic");
            keyChain3.setDesign("Square");
            keyChain3.setCost(80.0);

            boolean ke1 = keyChain1.equals(keyChain2);
            boolean ke2 = keyChain1.equals(keyChain3);
            boolean ke3 = keyChain2.equals(keyChain3);
            System.out.println("keyChain1 and keyChain2 isMatching? " + ke1);
            System.out.println("keyChain1 and keyChain3 isMatching? " + ke2);
            System.out.println("keyChain2 and keyChain3 isMatching? " + ke3);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("using setter");
            System.out.println("toString");

            Kite kite = new Kite();
            kite.setBrand("FlyHigh");
            kite.setSize("Large");
            kite.setPattern("Dragon");
            kite.setWeight(0.25);
            System.out.println(kite);

            System.out.println("Equals method");

            Kite kite1 = new Kite();
            kite1.setBrand("SkyRider");
            kite1.setSize("Medium");
            kite1.setPattern("Star");
            kite1.setWeight(0.20);

            Kite kite2 = new Kite();
            kite2.setBrand("SkyRider");
            kite2.setSize("Medium");
            kite2.setPattern("Star");
            kite2.setWeight(0.20);

            Kite kite3 = new Kite();
            kite3.setBrand("Zoomer");
            kite3.setSize("Small");
            kite3.setPattern("Plain");
            kite3.setWeight(0.15);

            boolean ki1 = kite1.equals(kite2);
            boolean ki2 = kite1.equals(kite3);
            boolean ki3 = kite2.equals(kite3);
            System.out.println("kite1 and kite2 isMatching? " + ki1);
            System.out.println("kite1 and kite3 isMatching? " + ki2);
            System.out.println("kite2 and kite3 isMatching? " + ki3);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("using setter");
            System.out.println("toString");

            Crown crown = new Crown();
            crown.setMaterial("Gold");
            crown.setStyle("Royal");
            crown.setGemstone("Ruby");
            crown.setWeight(0.5);
            System.out.println(crown);

            System.out.println("Equals method");

            Crown crown1 = new Crown();
            crown1.setMaterial("Silver");
            crown1.setStyle("Vintage");
            crown1.setGemstone("Diamond");
            crown1.setWeight(0.4);

            Crown crown2 = new Crown();
            crown2.setMaterial("Silver");
            crown2.setStyle("Vintage");
            crown2.setGemstone("Diamond");
            crown2.setWeight(0.4);

            Crown crown3 = new Crown();
            crown3.setMaterial("Gold");
            crown3.setStyle("Modern");
            crown3.setGemstone("Emerald");
            crown3.setWeight(0.6);

            boolean cr1 = crown1.equals(crown2);
            boolean cr2 = crown1.equals(crown3);
            boolean cr3 = crown2.equals(crown3);
            System.out.println("crown1 and crown2 isMatching? " + cr1);
            System.out.println("crown1 and crown3 isMatching? " + cr2);
            System.out.println("crown2 and crown3 isMatching? " + cr3);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("using setter");
            System.out.println("toString");

            Lock lock = new Lock();
            lock.setMaterial("Steel");
            lock.setMechanism("Combination");
            lock.setSecurityLevel("High");
            lock.setPrice(150.0);
            System.out.println(lock);

            System.out.println("Equals method");

            Lock lock1 = new Lock();
            lock1.setMaterial("Brass");
            lock1.setMechanism("Key");
            lock1.setSecurityLevel("Medium");
            lock1.setPrice(80.0);

            Lock lock2 = new Lock();
            lock2.setMaterial("Brass");
            lock2.setMechanism("Key");
            lock2.setSecurityLevel("Medium");
            lock2.setPrice(80.0);

            Lock lock3 = new Lock();
            lock3.setMaterial("Aluminum");
            lock3.setMechanism("Keyless");
            lock3.setSecurityLevel("Low");
            lock3.setPrice(40.0);

            boolean lo1 = lock1.equals(lock2);
            boolean lo2 = lock1.equals(lock3);
            boolean lo3 = lock2.equals(lock3);
            System.out.println("lock1 and lock2 isMatching? " + lo1);
            System.out.println("lock1 and lock3 isMatching? " + lo2);
            System.out.println("lock2 and lock3 isMatching? " + lo3);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("using setter");
            System.out.println("toString");

            Jacket jacket = new Jacket();
            jacket.setFabric("Leather");
            jacket.setColor("Black");
            jacket.setSize("Medium");
            jacket.setPrice(2500.0);
            System.out.println(jacket);

            System.out.println("Equals method");

            Jacket jacket1 = new Jacket();
            jacket1.setFabric("Cotton");
            jacket1.setColor("Blue");
            jacket1.setSize("Large");
            jacket1.setPrice(1500.0);

            Jacket jacket2 = new Jacket();
            jacket2.setFabric("Cotton");
            jacket2.setColor("Blue");
            jacket2.setSize("Large");
            jacket2.setPrice(1500.0);

            Jacket jacket3 = new Jacket();
            jacket3.setFabric("Leather");
            jacket3.setColor("Brown");
            jacket3.setSize("Medium");
            jacket3.setPrice(2000.0);

            boolean ja1 = jacket1.equals(jacket2);
            boolean ja2 = jacket1.equals(jacket3);
            boolean ja3 = jacket2.equals(jacket3);
            System.out.println("jacket1 and jacket2 isMatching? " + ja1);
            System.out.println("jacket1 and jacket3 isMatching? " + ja2);
            System.out.println("jacket2 and jacket3 isMatching? " + ja3);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("using setter");
            System.out.println("toString");

            IceCream iceCream = new IceCream();
            iceCream.setFlavor("Chocolate");
            iceCream.setSize("Medium");
            iceCream.setVegan(false);
            iceCream.setPrice(150.0);
            System.out.println(iceCream);

            System.out.println("Equals method");

            IceCream iceCream1 = new IceCream();
            iceCream1.setFlavor("Vanilla");
            iceCream1.setSize("Small");
            iceCream1.setVegan(true);
            iceCream1.setPrice(120.0);

            IceCream iceCream2 = new IceCream();
            iceCream2.setFlavor("Vanilla");
            iceCream2.setSize("Small");
            iceCream2.setVegan(true);
            iceCream2.setPrice(120.0);

            IceCream iceCream3 = new IceCream();
            iceCream3.setFlavor("Chocolate");
            iceCream3.setSize("Large");
            iceCream3.setVegan(false);
            iceCream3.setPrice(180.0);

            boolean ic1 = iceCream1.equals(iceCream2);
            boolean ic2 = iceCream1.equals(iceCream3);
            boolean ic3 = iceCream2.equals(iceCream3);
            System.out.println("iceCream1 and iceCream2 isMatching? " + ic1);
            System.out.println("iceCream1 and iceCream3 isMatching? " + ic2);
            System.out.println("iceCream2 and iceCream3 isMatching? " + ic3);
            System.out.println("------------------------------------------------------------------------");
            //to strinng
        System.out.println("to String");
        Tree tree=new Tree();
        tree.setName("Papaya");
        tree.setHeight(24);
        System.out.println(tree);
        //equals
        System.out.println("equals methos");
        Tree tree1=new Tree();
        tree1.setName("apple");
        tree1.setHeight(14);

        Tree tree2=new Tree();
        tree2.setName("Orange");
        tree2.setHeight(30);

        Tree tree3=new Tree();
        tree3.setName("apple");
        tree3.setHeight(14);

        boolean tr1=tree1.equals(tree2);
        boolean tr2=tree1.equals(tree3);
        boolean tr3=tree2.equals(tree3);

        System.out.println("tree1 and tree2 isMatching?"+tr1);
        System.out.println("tree1 and tree3 isMatching?"+tr2);
        System.out.println("tree2 and tree3 isMatching?"+tr3);
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("using setter");
        System.out.println("toString");

        Door door = new Door();
        door.setMaterial("Wood");
        door.setColor("Brown");
        door.setType("Single Door");
        door.setHeight(7.0);
        System.out.println(door);

        System.out.println("Equals method");

        Door door1 = new Door();
        door1.setMaterial("Steel");
        door1.setColor("Gray");
        door1.setType("Double Door");
        door1.setHeight(8.0);

        Door door2 = new Door();
        door2.setMaterial("Steel");
        door2.setColor("Gray");
        door2.setType("Double Door");
        door2.setHeight(8.0);

        Door door3 = new Door();
        door3.setMaterial("PVC");
        door3.setColor("White");
        door3.setType("Folding");
        door3.setHeight(6.5);

        boolean doo1 = door1.equals(door2);
        boolean doo2 = door1.equals(door3);
        boolean doo3 = door2.equals(door3);
        System.out.println("door1 and door2 isMatching? " + doo1);
        System.out.println("door1 and door3 isMatching? " + doo2);
        System.out.println("door2 and door3 isMatching? " + doo3);
        System.out.println("------------------------------------------------------------------------");

        System.out.println("using setter");
        System.out.println("toString");

        Bird bird = new Bird();
        bird.setName("Parrot");
        bird.setColor("Green");
        bird.setHabitat("Tropical");
        bird.setWingspan(0.5);
        System.out.println(bird);

        System.out.println("Equals method");

        Bird bird1 = new Bird();
        bird1.setName("Sparrow");
        bird1.setColor("Brown");
        bird1.setHabitat("Urban");
        bird1.setWingspan(0.3);

        Bird bird2 = new Bird();
        bird2.setName("Sparrow");
        bird2.setColor("Brown");
        bird2.setHabitat("Urban");
        bird2.setWingspan(0.3);

        Bird bird3 = new Bird();
        bird3.setName("Peacock");
        bird3.setColor("Blue");
        bird3.setHabitat("Forest");
        bird3.setWingspan(1.5);

        boolean bi1 = bird1.equals(bird2);
        boolean bi2 = bird1.equals(bird3);
        boolean bi3 = bird2.equals(bird3);
        System.out.println("bird1 and bird2 isMatching? " + b1);
        System.out.println("bird1 and bird3 isMatching? " + b2);
        System.out.println("bird2 and bird3 isMatching? " + b3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("using setter");
        System.out.println("toString");

        Sun sun = new Sun();
        sun.setColor("Yellow");
        sun.setTemperature(5778.0);
        sun.setGalaxy("Milky Way");
        sun.setRadius(695700.0);
        System.out.println(sun);

        System.out.println("Equals method");

        Sun sun1 = new Sun();
        sun1.setColor("Yellow");
        sun1.setTemperature(5778.0);
        sun1.setGalaxy("Milky Way");
        sun1.setRadius(695700.0);

        Sun sun2 = new Sun();
        sun2.setColor("Yellow");
        sun2.setTemperature(5778.0);
        sun2.setGalaxy("Milky Way");
        sun2.setRadius(695700.0);

        Sun sun3 = new Sun();
        sun3.setColor("Red");
        sun3.setTemperature(3500.0);
        sun3.setGalaxy("Andromeda");
        sun3.setRadius(400000.0);

        boolean su1 = sun1.equals(sun2);
        boolean su2 = sun1.equals(sun3);
        boolean su3 = sun2.equals(sun3);
        System.out.println("sun1 and sun2 isMatching? " + s1);
        System.out.println("sun1 and sun3 isMatching? " + s2);
        System.out.println("sun2 and sun3 isMatching? " + s3);
        System.out.println("------------------------------------------------------------------------");

        System.out.println("using setter");
        System.out.println("toString");

        Scale scale = new Scale();
        scale.setBrand("Atom");
        scale.setType("Digital");
        scale.setColor("Black");
        scale.setWeightLimit(150.0);
        System.out.println(scale);

        System.out.println("Equals method");

        Scale scale1 = new Scale();
        scale1.setBrand("WeighMax");
        scale1.setType("Analog");
        scale1.setColor("White");
        scale1.setWeightLimit(120.0);

        Scale scale2 = new Scale();
        scale2.setBrand("WeighMax");
        scale2.setType("Analog");
        scale2.setColor("White");
        scale2.setWeightLimit(120.0);

        Scale scale3 = new Scale();
        scale3.setBrand("Atom");
        scale3.setType("Smart");
        scale3.setColor("Silver");
        scale3.setWeightLimit(200.0);

        boolean sc1 = scale1.equals(scale2);
        boolean sc2 = scale1.equals(scale3);
        boolean sc3 = scale2.equals(scale3);
        System.out.println("scale1 and scale2 isMatching? " + sc1);
        System.out.println("scale1 and scale3 isMatching? " + sc2);
        System.out.println("scale2 and scale3 isMatching? " + sc3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("using setter");
        System.out.println("toString");

        Ticket ticket = new Ticket();
        ticket.setEventName("Rock Concert");
        ticket.setSeatNumber("A12");
        ticket.setDate("2025-05-10");
        ticket.setPrice(350.0);
        System.out.println(ticket);

        System.out.println("Equals method");

        Ticket ticket1 = new Ticket();
        ticket1.setEventName("Comedy Show");
        ticket1.setSeatNumber("B15");
        ticket1.setDate("2025-06-20");
        ticket1.setPrice(250.0);

        Ticket ticket2 = new Ticket();
        ticket2.setEventName("Comedy Show");
        ticket2.setSeatNumber("B15");
        ticket2.setDate("2025-06-20");
        ticket2.setPrice(250.0);

        Ticket ticket3 = new Ticket();
        ticket3.setEventName("Drama Play");
        ticket3.setSeatNumber("C20");
        ticket3.setDate("2025-07-01");
        ticket3.setPrice(400.0);

        boolean ti1 = ticket1.equals(ticket2);
        boolean ti2 = ticket1.equals(ticket3);
        boolean ti3 = ticket2.equals(ticket3);
        System.out.println("ticket1 and ticket2 isMatching? " + t1);
        System.out.println("ticket1 and ticket3 isMatching? " + t2);
        System.out.println("ticket2 and ticket3 isMatching? " + t3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("using setter");
        System.out.println("toString");

        Jelly jelly = new Jelly();
        jelly.setFlavor("Strawberry");
        jelly.setBrand("Kissan");
        jelly.setColor("Red");
        jelly.setWeight(150.0);
        System.out.println(jelly);

        System.out.println("Equals method");

        Jelly jelly1 = new Jelly();
        jelly1.setFlavor("Mango");
        jelly1.setBrand("Mapro");
        jelly1.setColor("Yellow");
        jelly1.setWeight(120.0);

        Jelly jelly2 = new Jelly();
        jelly2.setFlavor("Mango");
        jelly2.setBrand("Mapro");
        jelly2.setColor("Yellow");
        jelly2.setWeight(120.0);

        Jelly jelly3 = new Jelly();
        jelly3.setFlavor("Grape");
        jelly3.setBrand("FruityFun");
        jelly3.setColor("Purple");
        jelly3.setWeight(130.0);

        boolean je1 = jelly1.equals(jelly2);
        boolean je2 = jelly1.equals(jelly3);
        boolean je3 = jelly2.equals(jelly3);
        System.out.println("jelly1 and jelly2 isMatching? " + j1);
        System.out.println("jelly1 and jelly3 isMatching? " + j2);
        System.out.println("jelly2 and jelly3 isMatching? " + j3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("using setter");
        System.out.println("toString");

        Paint paint = new Paint();
        paint.setBrand("Asian Paints");
        paint.setColor("Blue");
        paint.setType("Emulsion");
        paint.setQuantity(5.0);
        System.out.println(paint);

        System.out.println("Equals method");

        Paint paint1 = new Paint();
        paint1.setBrand("Nerolac");
        paint1.setColor("White");
        paint1.setType("Distemper");
        paint1.setQuantity(10.0);

        Paint paint2 = new Paint();
        paint2.setBrand("Nerolac");
        paint2.setColor("White");
        paint2.setType("Distemper");
        paint2.setQuantity(10.0);

        Paint paint3 = new Paint();
        paint3.setBrand("Berger");
        paint3.setColor("Yellow");
        paint3.setType("Glossy");
        paint3.setQuantity(8.0);

        boolean pai1 = paint1.equals(paint2);
        boolean pai2 = paint1.equals(paint3);
        boolean pai3 = paint2.equals(paint3);
        System.out.println("paint1 and paint2 isMatching? " + p1);
        System.out.println("paint1 and paint3 isMatching? " + p2);
        System.out.println("paint2 and paint3 isMatching? " + p3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("using setter");
        System.out.println("toString");

        Polish polish = new Polish();
        polish.setBrand("Colin");
        polish.setType("Spray");
        polish.setPurpose("Glass Cleaning");
        polish.setQuantity(500.0);
        System.out.println(polish);

        System.out.println("Equals method");

        Polish polish1 = new Polish();
        polish1.setBrand("Pidilite");
        polish1.setType("Liquid");
        polish1.setPurpose("Wood Polish");
        polish1.setQuantity(750.0);

        Polish polish2 = new Polish();
        polish2.setBrand("Pidilite");
        polish2.setType("Liquid");
        polish2.setPurpose("Wood Polish");
        polish2.setQuantity(750.0);

        Polish polish3 = new Polish();
        polish3.setBrand("Brasso");
        polish3.setType("Cream");
        polish3.setPurpose("Metal Polish");
        polish3.setQuantity(300.0);

        boolean po1 = polish1.equals(polish2);
        boolean po2 = polish1.equals(polish3);
        boolean po3 = polish2.equals(polish3);
        System.out.println("polish1 and polish2 isMatching? " + po1);
        System.out.println("polish1 and polish3 isMatching? " + po2);
        System.out.println("polish2 and polish3 isMatching? " + po3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("using setter");
        System.out.println("toString");

        PanCard panCard = new PanCard();
        panCard.setPanNumber("ABCDE1234F");
        panCard.setName("John Doe");
        panCard.setDob("1990-12-15");
        panCard.setAddress("123, Some Street, Some City, Some Country");
        System.out.println(panCard);

        System.out.println("Equals method");

        PanCard panCard1 = new PanCard();
        panCard1.setPanNumber("ABCDE5678G");
        panCard1.setName("Jane Smith");
        panCard1.setDob("1985-07-20");
        panCard1.setAddress("456, Another Street, Another City, Another Country");

        PanCard panCard2 = new PanCard();
        panCard2.setPanNumber("ABCDE5678G");
        panCard2.setName("Jane Smith");
        panCard2.setDob("1985-07-20");
        panCard2.setAddress("456, Another Street, Another City, Another Country");

        PanCard panCard3 = new PanCard();
        panCard3.setPanNumber("XYZAB6789D");
        panCard3.setName("Mike Johnson");
        panCard3.setDob("1992-05-05");
        panCard3.setAddress("789, Yet Another Street, Yet Another City, Yet Another Country");

        boolean pan1 = panCard1.equals(panCard2);
        boolean pan2 = panCard1.equals(panCard3);
        boolean pan3 = panCard2.equals(panCard3);
        System.out.println("panCard1 and panCard2 isMatching? " + p1);
        System.out.println("panCard1 and panCard3 isMatching? " + p2);
        System.out.println("panCard2 and panCard3 isMatching? " + p3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("using setter");
        System.out.println("toString");

        Peacock peacock = new Peacock();
        peacock.setSpecies("Indian Peafowl");
        peacock.setColor("Blue");
        peacock.setHabitat("Tropical forests");
        peacock.setWeight(4.0);
        System.out.println(peacock);

        System.out.println("Equals method");

        Peacock peacock1 = new Peacock();
        peacock1.setSpecies("Peafowl");
        peacock1.setColor("Green");
        peacock1.setHabitat("Rainforests");
        peacock1.setWeight(3.5);

        Peacock peacock2 = new Peacock();
        peacock2.setSpecies("Peafowl");
        peacock2.setColor("Green");
        peacock2.setHabitat("Rainforests");
        peacock2.setWeight(3.5);

        Peacock peacock3 = new Peacock();
        peacock3.setSpecies("Peacock");
        peacock3.setColor("Blue");
        peacock3.setHabitat("Grasslands");
        peacock3.setWeight(4.2);

        boolean pc1 = peacock1.equals(peacock2);
        boolean pc2 = peacock1.equals(peacock3);
        boolean pc3 = peacock2.equals(peacock3);
        System.out.println("peacock1 and peacock2 isMatching? " + p1);
        System.out.println("peacock1 and peacock3 isMatching? " + p2);
        System.out.println("peacock2 and peacock3 isMatching? " + p3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("using setter");
        System.out.println("toString");

        Potato potato = new Potato();
        potato.setVariety("Russet");
        potato.setColor("Brown");
        potato.setWeight(1.5);
        potato.setOrigin("USA");
        System.out.println(potato);

        System.out.println("Equals method");

        Potato potato1 = new Potato();
        potato1.setVariety("Yukon Gold");
        potato1.setColor("Yellow");
        potato1.setWeight(1.2);
        potato1.setOrigin("Canada");

        Potato potato2 = new Potato();
        potato2.setVariety("Yukon Gold");
        potato2.setColor("Yellow");
        potato2.setWeight(1.2);
        potato2.setOrigin("Canada");

        Potato potato3 = new Potato();
        potato3.setVariety("Russet");
        potato3.setColor("Brown");
        potato3.setWeight(1.4);
        potato3.setOrigin("USA");

        boolean pt1 = potato1.equals(potato2);
        boolean pt2 = potato1.equals(potato3);
        boolean pt3 = potato2.equals(potato3);
        System.out.println("potato1 and potato2 isMatching? " + p1);
        System.out.println("potato1 and potato3 isMatching? " + p2);
        System.out.println("potato2 and potato3 isMatching? " + p3);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("using setter");
        System.out.println("toString");

        Pineapple pineapple = new Pineapple();
        pineapple.setVariety("Queen");
        pineapple.setColor("Golden Yellow");
        pineapple.setWeight(1.2);
        pineapple.setOrigin("India");
        System.out.println(pineapple);

        System.out.println("Equals method");

        Pineapple pineapple1 = new Pineapple();
        pineapple1.setVariety("Ananas");
        pineapple1.setColor("Greenish Yellow");
        pineapple1.setWeight(1.5);
        pineapple1.setOrigin("Philippines");

        Pineapple pineapple2 = new Pineapple();
        pineapple2.setVariety("Ananas");
        pineapple2.setColor("Greenish Yellow");
        pineapple2.setWeight(1.5);
        pineapple2.setOrigin("Philippines");

        Pineapple pineapple3 = new Pineapple();
        pineapple3.setVariety("Queen");
        pineapple3.setColor("Golden Yellow");
        pineapple3.setWeight(1.0);
        pineapple3.setOrigin("India");

        boolean pine1 = pineapple1.equals(pineapple2);
        boolean pine2 = pineapple1.equals(pineapple3);
        boolean pine3 = pineapple2.equals(pineapple3);
        System.out.println("pineapple1 and pineapple2 isMatching? " + p1);
        System.out.println("pineapple1 and pineapple3 isMatching? " + p2);
        System.out.println("pineapple2 and pineapple3 isMatching? " + p3);
        System.out.println("-----------------------------------------------------------------------");




    }
}
