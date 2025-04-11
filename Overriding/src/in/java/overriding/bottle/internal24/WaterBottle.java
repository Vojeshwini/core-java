package in.java.overriding.bottle.internal24;

public class WaterBottle extends Bottle {

    @Override
    public void material() {
        System.out.println("running the material in WaterBottle");
    }

    public void capacity() {
        System.out.println("running the capacity in WaterBottle");
    }
}

