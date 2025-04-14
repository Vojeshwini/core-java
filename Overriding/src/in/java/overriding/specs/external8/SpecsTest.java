package in.java.overriding.specs.external8;
import in.java.overriding.specs.internal8.*;

public class SpecsTest {
    public void testSpecs(Specs specs) {
        if (specs != null) {
            specs.frame();
            if (specs instanceof Brand) {
                Brand ref = (Brand) specs;
                ref.black();
            } else {
                System.err.println("black is not available for this Specs");
            }
        } else {
            System.err.println("null");
        }
    }
}
