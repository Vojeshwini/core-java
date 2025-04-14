package in.java.overriding.bulb.external33;
import in.java.overriding.bulb.internal33.*;

public class Lighting {
    public void illuminate(Bulb bulb) {
        if (bulb != null) {
            bulb.glow();
            if (bulb instanceof LEDBulb) {
                LEDBulb ref = (LEDBulb) bulb;
                ref.powerConsumption();
            } else {
                System.err.println("energyEfficiency is not LEDBulb");
            }
        } else {
            System.err.println("null");
        }
    }
}
