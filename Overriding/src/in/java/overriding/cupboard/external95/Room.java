
package in.java.overriding.cupboard.external95;
import in.java.overriding.cupboard.internal95.*;

public class Room {
    public void access(Cupboard cupboard) {
        if (cupboard != null) {
            cupboard.open();
            if (cupboard instanceof WoodenCupboard) {
                WoodenCupboard ref = (WoodenCupboard) cupboard;
                ref.polish();
            } else {
                System.err.println("polish is not WoodenCupboard");
            }
        } else {
            System.err.println("null");
        }
    }
}
