package in.java.overriding.ring.external18;
import in.java.overriding.ring.internal18.*;

public class RingTest {
    public void testSilver(Ring ring) {
        if (ring != null) {
            ring.silver();
            if (ring instanceof Size) {
                Size ref = (Size) ring;
                ref.anklet();
            } else {
                System.err.println("anklet is not available for this Ring");
            }
        } else {
            System.err.println("null");
        }
    }
}
