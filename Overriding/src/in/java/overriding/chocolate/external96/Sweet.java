package in.java.overriding.chocolate.external96;
import in.java.overriding.chocolate.internal96.*;

public class Sweet {
    public void check(Chocolate chocolate) {
        if (chocolate != null) {
            chocolate.taste();
            if (chocolate instanceof DarkChocolate) {
                DarkChocolate ref = (DarkChocolate) chocolate;
                ref.cocoaPercentage();
            } else {
                System.err.println("cocoaPercentage is not DarkChocolate");
            }
        } else {
            System.err.println("null");
        }
    }
}