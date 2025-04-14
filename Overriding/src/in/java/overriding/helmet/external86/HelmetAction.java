
package in.java.overriding.helmet.external86;
import in.java.overriding.helmet.internal86.*;

public class HelmetAction {
    public void performAction(Helmet helmet) {
        if (helmet != null) {
            helmet.protect();
            if (helmet instanceof RacingHelmet) {
                RacingHelmet ref = (RacingHelmet) helmet;
                ref.adjustVisor();
            } else {
                System.err.println("adjustVisor is not available for this type of Helmet");
            }
        } else {
            System.err.println("null");
        }
    }
}
