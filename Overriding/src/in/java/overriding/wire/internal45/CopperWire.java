package in.java.overriding.wire.internal45;
public class CopperWire extends Wire {

    @Override
    public void transmit() {
        System.out.println("running the transmit in CopperWire");
    }

    public void conductivity() {
        System.out.println("running the conductivity in CopperWire");
    }
}

