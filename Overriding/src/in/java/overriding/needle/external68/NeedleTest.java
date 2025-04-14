package in.java.overriding.needle.external68;
import in.java.overriding.needle.internal68.*;

public class NeedleTest {
    public void testPierce(Needle needle) {
        if (needle != null) {
            needle.pierce();
            if (needle instanceof SewingNeedle) {
                SewingNeedle ref = (SewingNeedle) needle;
                ref.stitch();
            } else {
                System.err.println("stitch is not available for this Needle");
            }
        } else {
            System.err.println("null");
        }
    }
}
