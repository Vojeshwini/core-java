package in.java.overriding.wire.external45;

import in.java.overriding.wire.internal45.*;

public class WireTest {
    public void testWire(Wire wire) {
        if (wire != null) {
            wire.transmit();
            if (wire instanceof CopperWire) {
                CopperWire copperWire = (CopperWire) wire;
                copperWire.conductivity();
            } else {
                System.err.println("conductivity is not available for this Wire");
            }
        } else {
            System.err.println("wire is null");
        }
    }
}
