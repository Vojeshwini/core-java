package in.java.overriding.sun.internal26;

public class RisingSun extends Sun {

    @Override
    public void shine() {
        System.out.println("running the shine in RisingSun");
    }

    public void direction() {
        System.out.println("running the direction in RisingSun");
    }
}

