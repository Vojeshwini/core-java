package in.java.overriding.panipuri.external92;
import in.java.overriding.panipuri.internal92.*;

public class FoodStall {
    public void serveItem(Panipuri panipuri) {
        if (panipuri != null) {
            panipuri.serve();
            if (panipuri instanceof SpicyPanipuri) {
                SpicyPanipuri ref = (SpicyPanipuri) panipuri;
                ref.addExtraSpice();
            } else {
                System.err.println("addExtraSpice is not SpicyPanipuri");
            }
        } else {
            System.err.println("null");
        }
    }
}