package in.java.overriding.stone.internal60;

public class GraniteStone extends Stone {

    @Override
    public void weight() {
        System.out.println("running the weight in GraniteStone");
    }

    public void polish() {
        System.out.println("running the polish in GraniteStone");
    }
}

