package in.java.overriding.washing.external25;

import in.java.overriding.washing.internal25.*;

public class WashingMachineTest {
    public void testMachine(WashingMachine machine) {
        if (machine != null) {
            machine.brand();
            if (machine instanceof LGWashingMachine) {
                LGWashingMachine lg = (LGWashingMachine) machine;
                lg.capacity();
            } else {
                System.err.println("capacity is not available for this WashingMachine");
            }
        } else {
            System.err.println("machine is null");
        }
    }
}
