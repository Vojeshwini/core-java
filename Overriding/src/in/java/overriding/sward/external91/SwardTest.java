package in.java.overriding.sward.external91;

import in.java.overriding.sward.internal91.*;

public class SwardTest {

    public void checkSward(Sward sward) {
        if (sward != null) {
            sward.attack();
            if (sward instanceof SteelSward) {
                SteelSward steelSward = (SteelSward) sward;
                steelSward.sharpen();
            } else {
                System.err.println("sharpen method is not available for this Sward");
            }
        } else {
            System.err.println("Sward is null");
        }
    }
}
