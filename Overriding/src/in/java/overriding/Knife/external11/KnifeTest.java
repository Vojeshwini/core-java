package in.java.overriding.Knife.external11;
import in.java.overriding.Knife.internal11.*;

public class KnifeTest {
    public void testCut(Knife knife) {
        if (knife != null) {
            knife.cut();
            if (knife instanceof Veggies) {
                Veggies ref = (Veggies) knife;
                ref.fruit();
            } else {
                System.err.println("fruit is not available for this Knife");
            }
        } else {
            System.err.println("null");
        }
    }
}
