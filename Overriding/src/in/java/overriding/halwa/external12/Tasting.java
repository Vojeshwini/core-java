// Example: Halwa
package in.java.overriding.halwa.external12;
import in.java.overriding.halwa.internal12.*;

public class Tasting {
    public void taste(Halwa halwa) {
        if (halwa != null) {
            halwa.sweet();
            if (halwa instanceof PineApple) {
                PineApple ref = (PineApple) halwa;
                ref.piece();
            } else {
                System.err.println("piece is not available for this type of Halwa");
            }
        } else {
            System.err.println("null");
        }
    }
}
