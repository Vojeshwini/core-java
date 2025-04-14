
package in.java.overriding.earring.external27;
import in.java.overriding.earring.internal27.*;

public class JewelryShop {
    public void display(Earring earring) {
        if (earring != null) {
            earring.design();
            if (earring instanceof GoldEarring) {
                GoldEarring ref = (GoldEarring) earring;
                ref.price();
            } else {
                System.err.println("price is not GoldEarring");
            }
        } else {
            System.err.println("null");
        }
    }
}
