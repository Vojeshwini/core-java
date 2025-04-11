package in.java.overriding.cupboard.internal95;

public class WoodenCupboard extends Cupboard {

    @Override
    public void open() {
        System.out.println("running the open in WoodenCupboard");
    }

    public void polish() {
        System.out.println("running the polish in WoodenCupboard");
    }
}
