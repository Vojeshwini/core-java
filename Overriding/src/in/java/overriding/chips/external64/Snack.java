package in.java.overriding.chips.external64;
import in.java.overriding.chips.internal64.*;

public class Snack {
    public void serve(Chips chips) {
        if (chips != null) {
            chips.taste();
            if (chips instanceof PotatoChips) {
                PotatoChips ref = (PotatoChips) chips;
                ref.crunch();
            } else {
                System.err.println("crunch is not PotatoChips");
            }
        } else {
            System.err.println("null");
        }
    }
}