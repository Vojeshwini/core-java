package in.java.overriding.net.external83;
import in.java.overriding.net.internal83.*;

public class NetTest {
    public void testTrap(Net net) {
        if (net != null) {
            net.trap();
            if (net instanceof FishingNet) {
                FishingNet ref = (FishingNet) net;
                ref.throwNet();
            } else {
                System.err.println("throwNet is not available for this Net");
            }
        } else {
            System.err.println("null");
        }
    }
}
