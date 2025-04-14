
package in.java.overriding.earpod.external3;
import in.java.overriding.earpod.internal3.*;

public class Shop {
    public void sell(Earpod earpod) {
        if (earpod != null) {
            earpod.price();
            if (earpod instanceof Color) {
                Color ref = (Color) earpod;
                ref.brand();
            } else {
                System.err.println("brand is not Color");
            }
        } else {
            System.err.println("null");
        }
    }
}
