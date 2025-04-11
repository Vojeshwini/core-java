package in.java.overriding.hanger.internal55;
public class ClothHanger extends Hanger {

    @Override
    public void hold() {
        System.out.println("running the hold in ClothHanger");
    }

    public void rotate() {
        System.out.println("running the rotate in ClothHanger");
    }
}

