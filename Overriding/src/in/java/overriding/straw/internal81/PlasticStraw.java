package in.java.overriding.straw.internal81;
public class PlasticStraw extends Straw {

    @Override
    public void use() {
        System.out.println("Using the plastic straw");
    }

    public void recycle() {
        System.out.println("Recycling the plastic straw");
    }
}
