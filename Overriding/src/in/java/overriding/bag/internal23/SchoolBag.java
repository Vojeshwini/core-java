package in.java.overriding.bag.internal23;

public class SchoolBag extends Bag {
public SchoolBag(){
    super("wildCraft","black");
    System.out.println("running inside the laptop constructor");
}
    @Override
    public void type() {
        System.out.println("running the type in SchoolBag");
    }

    public void capacity() {
        System.out.println("running the capacity in SchoolBag");
    }
}

