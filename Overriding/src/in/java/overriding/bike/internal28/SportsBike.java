package in.java.overriding.bike.internal28;

public class SportsBike extends Bike {

    @Override
    public void speed() {
        System.out.println("running the speed in SportsBike");
    }

    public void engine() {
        System.out.println("running the engine in SportsBike");
    }
}

