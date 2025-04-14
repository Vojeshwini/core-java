package in.java.overriding.mask.external15;
import in.java.overriding.mask.internal15.*;

public class MaskTest {
    public void checkMask(Mask mask) {
        if (mask != null) {
            mask.mask();
            if (mask instanceof Material) {
                Material ref = (Material) mask;
                ref.color();
            } else {
                System.err.println("color is not available for this Mask");
            }
        } else {
            System.err.println("null");
        }
    }
}
