package in.java.overriding.bag.external23;
import in.java.overriding.bag.internal23.*;

public class HandBag {
    public void brand(Bag bag){
        if(bag!=null){
            bag.type();
            if(bag instanceof SchoolBag){
                SchoolBag schoolBag=(SchoolBag)bag;
                schoolBag.capacity();
            }
            else{
                System.err.println("no answer");
            }
        }else{
            System.err.println("bag is null");
        }
    }
}