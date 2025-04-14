package in.java.overriding.bottle.external24;
import in.java.overriding.bottle.internal24.*;

public class Container {
    public void storeLiquid(Bottle bottle) {
        if (bottle != null) {
            bottle.material();
            if (bottle instanceof WaterBottle) {
                WaterBottle ref = (WaterBottle) bottle;
                ref.capacity();
            } else {
                System.err.println("drink is not WaterBottle");
            }
        } else {
            System.err.println("null");
        }
    }
}
