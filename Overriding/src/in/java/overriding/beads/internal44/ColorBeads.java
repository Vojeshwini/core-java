package in.java.overriding.beads.internal44;
public class ColorBeads extends Beads {

    @Override
    public void decorate() {
        System.out.println("running the decorate in ColorBeads");
    }

    public void sortByColor() {
        System.out.println("running the sortByColor in ColorBeads");
    }
}
