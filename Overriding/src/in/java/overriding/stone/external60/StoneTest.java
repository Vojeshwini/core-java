package in.java.overriding.stone.external60;
import in.java.overriding.stone.internal60.*;

public class StoneTest {
    public void testStone(Stone stone) {
        if (stone != null) {
            stone.weight();
            if (stone instanceof GraniteStone) {
                GraniteStone ref = (GraniteStone) stone;
                ref.polish();
            } else {
                System.err.println("polish is not available for this Stone");
            }
        } else {
            System.err.println("null");
        }
    }
}
