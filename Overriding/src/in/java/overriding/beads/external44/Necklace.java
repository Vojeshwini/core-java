package in.java.overriding.beads.external44;
import in.java.overriding.beads.internal44.*;


public class Necklace {
    public void greenPearl(Beads beads) {
        if (beads != null) {
            beads.decorate();
            if (beads instanceof ColorBeads) {
                ColorBeads col = (ColorBeads) beads;
                col.sortByColor();
            } else {
                System.out.println("beads id not color beads");
            }
        } else {

            System.out.println("null");
        }
    }
}
