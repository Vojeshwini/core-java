package in.java.overriding.bracklet.external90;
import in.java.overriding.bracklet.internal90.*;

public class Fashion {
    public void wear(Braklet bracklet) {
        if (bracklet != null) {
            bracklet.wear();
            if (bracklet instanceof GoldBraklet) {
                GoldBraklet ref = (GoldBraklet) bracklet;
                ref.shine();
            } else {
                System.err.println("weight is not GoldBracklet");
            }
        } else {
            System.err.println("null");
        }
    }
}
