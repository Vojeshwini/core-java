package in.java.overriding.Battery.internal21;

public class Exide extends Battery {

    @Override
    public void type() {
        System.out.println("running the type in Exide");
    }

    public void capacity() {
        System.out.println("running the capacity in Exide");
    }
}

