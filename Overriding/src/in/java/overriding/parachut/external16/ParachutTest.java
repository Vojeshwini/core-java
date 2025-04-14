package in.java.overriding.parachut.external16;
import in.java.overriding.parachut.internal16.*;

public class ParachutTest {
    public void testHeight(Parachut parachut) {
        if (parachut != null) {
            parachut.height();
            if (parachut instanceof Air) {
                Air ref = (Air) parachut;
                ref.cost();
            } else {
                System.err.println("cost method is not available for this Parachut");
            }
        } else {
            System.err.println("null");
        }
    }
}
