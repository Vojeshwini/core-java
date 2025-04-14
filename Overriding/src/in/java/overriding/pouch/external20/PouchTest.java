package in.java.overriding.pouch.external20;
import in.java.overriding.pouch.internal20.*;

public class PouchTest {
    public void testPencil(Pouch pouch) {
        if (pouch != null) {
            pouch.pencil();
            if (pouch instanceof Eraser) {
                Eraser ref = (Eraser) pouch;
                ref.apsara();
            } else {
                System.err.println("apsara method is not available for this Pouch");
            }
        } else {
            System.err.println("null");
        }
    }
}
