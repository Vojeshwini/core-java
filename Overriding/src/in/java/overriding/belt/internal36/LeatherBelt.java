package in.java.overriding.belt.internal36;

public class LeatherBelt extends Belt {

    @Override
    public void hold() {
        System.out.println("running the hold in LeatherBelt");
    }

    public void material() {
        System.out.println("running the material in LeatherBelt");
    }
}

