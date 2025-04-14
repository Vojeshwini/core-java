
package in.java.overriding.hanger.external55;
import in.java.overriding.hanger.internal55.*;

public class HangerAction {
    public void performAction(Hanger hanger) {
        if (hanger != null) {
            hanger.hold();
            if (hanger instanceof ClothHanger) {
                ClothHanger ref = (ClothHanger) hanger;
                ref.rotate();
            } else {
                System.err.println("rotate is not available for this type of Hanger");
            }
        } else {
            System.err.println("null");
        }
    }
}
