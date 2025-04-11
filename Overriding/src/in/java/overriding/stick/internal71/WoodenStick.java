package in.java.overriding.stick.internal71;
public class WoodenStick extends Stick {

    @Override
    public void hold() {
        System.out.println("running the hold in WoodenStick");
    }

    public void swing() {
        System.out.println("running the swing in WoodenStick");
    }
}
