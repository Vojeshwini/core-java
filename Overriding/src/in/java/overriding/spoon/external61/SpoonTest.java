package in.java.overriding.spoon.external61;
import in.java.overriding.spoon.internal61.*;

public class SpoonTest {
    public void testSpoon(Spoon spoon) {
        if (spoon != null) {
            spoon.use();
            if (spoon instanceof SteelSpoon) {
                SteelSpoon ref = (SteelSpoon) spoon;
                ref.shine();
            } else {
                System.err.println("shine is not available for this Spoon");
            }
        } else {
            System.err.println("null");
        }
    }
}
