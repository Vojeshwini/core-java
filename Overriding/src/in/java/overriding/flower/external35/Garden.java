// Example: Flower
package in.java.overriding.flower.external35;
import in.java.overriding.flower.internal35.*;

public class Garden {
    public void checkFlower(Flower flower) {
        if (flower != null) {
            flower.smell();
            if (flower instanceof Rose) {
                Rose ref = (Rose) flower;
                ref.color();
            } else {
                System.err.println("color is not available for this flower");
            }
        } else {
            System.err.println("null");
        }
    }
}
