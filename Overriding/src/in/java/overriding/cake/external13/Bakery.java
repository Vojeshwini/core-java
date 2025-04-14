package in.java.overriding.cake.external13;
import in.java.overriding.cake.internal13.*;

public class Bakery {
    public void serve(Cake cake) {
        if (cake != null) {
            cake.creamCake();
            if (cake instanceof Pastry) {
                Pastry ref = (Pastry) cake;
                ref.darkChololate();
            } else {
                System.err.println("garnish is not ChocolateCake");
            }
        } else {
            System.err.println("null");
        }
    }
}
