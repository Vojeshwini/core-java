
package in.java.overriding.diamond.external98;
import in.java.overriding.diamond.internal98.*;

public class Jewellery {
    public void display(Diamond diamond) {
        if (diamond != null) {
            diamond.shine();
            if (diamond instanceof CutDiamond) {
                CutDiamond ref = (CutDiamond) diamond;
                ref.sparkle();
            } else {
                System.err.println("sparkle is not CutDiamond");
            }
        } else {
            System.err.println("null");
        }
    }
}
