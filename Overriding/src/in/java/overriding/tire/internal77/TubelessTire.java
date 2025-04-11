package in.java.overriding.tire.internal77;
public class TubelessTire extends Tire {

    @Override
    public void rotate() {
        System.out.println("running the rotate in TubelessTire");
    }

    public void sealPuncture() {
        System.out.println("running the sealPuncture in TubelessTire");
    }
}
