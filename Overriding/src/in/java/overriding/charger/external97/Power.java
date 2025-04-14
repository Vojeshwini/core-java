package in.java.overriding.charger.external97;
import in.java.overriding.charger.internal97.*;

public class Power {
    public void supply(Charger charger) {
        if (charger != null) {
            charger.charge();
            if (charger instanceof FastCharger) {
                FastCharger ref = (FastCharger) charger;
                ref.outputPower();
            } else {
                System.err.println("quickCharge is not FastCharger");
            }
        } else {
            System.err.println("null");
        }
    }
}
