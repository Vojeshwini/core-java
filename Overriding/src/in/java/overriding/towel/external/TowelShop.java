package in.java.overriding.towel.external;

import in.java.overriding.towel.internal9.*;

public class TowelShop {
    public void display(Towel towel) {
        if (towel != null) {
            towel.cloth();
            if (towel instanceof Turkey) {
                Turkey turkey = (Turkey) towel;
                turkey.cotton();
            } else {
                System.err.println("cotton method is not available for this Towel");
            }
        } else {
            System.err.println("towel is null");
        }
    }
}
