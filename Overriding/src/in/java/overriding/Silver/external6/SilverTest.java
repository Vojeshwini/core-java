package in.java.overriding.Silver.external6;
import in.java.overriding.Silver.internal6.*;

public class SilverTest {
    public void testSilver(Silver silver) {
        if (silver != null) {
            silver.coin();
            if (silver instanceof Plate) {
                Plate ref = (Plate) silver;
                ref.glass();
            } else {
                System.err.println("glass is not available for this Silver");
            }
        } else {
            System.err.println("null");
        }
    }
}
