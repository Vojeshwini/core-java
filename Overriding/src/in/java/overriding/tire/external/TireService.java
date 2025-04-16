package in.java.overriding.tire.external77;

import in.java.overriding.tire.internal77.*;

public class TireService {
    public void check(Tire tire) {
        if (tire != null) {
            tire.rotate();
            if (tire instanceof TubelessTire) {
                TubelessTire tubeless = (TubelessTire) tire;
                tubeless.sealPuncture();
            } else {
                System.err.println("sealPuncture method is not available for this Tire");
            }
        } else {
            System.err.println("tire is null");
        }
    }
}
