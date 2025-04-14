package in.java.overriding.Locket.external7;
import in.java.overriding.Locket.internal7.*;

public class LocketTest {
    public void testChain(Locket locket) {
        if (locket != null) {
            locket.chain();
            if (locket instanceof Gold) {
                Gold ref = (Gold) locket;
                ref.shape();
            } else {
                System.err.println("shape is not available for this Locket");
            }
        } else {
            System.err.println("null");
        }
    }
}
