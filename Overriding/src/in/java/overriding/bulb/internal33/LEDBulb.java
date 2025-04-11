package in.java.overriding.bulb.internal33;

public class LEDBulb extends Bulb {

    @Override
    public void glow() {
        System.out.println("running the glow in LEDBulb");
    }

    public void powerConsumption() {
        System.out.println("running the powerConsumption in LEDBulb");
    }
}

