package in.java.overriding.straw.external81;

import in.java.overriding.straw.internal81.*;

public class StrawTest {
    public void testStraw(Straw straw) {
        if (straw != null) {
            straw.use();
            if (straw instanceof PlasticStraw) {
                PlasticStraw plasticStraw = (PlasticStraw) straw;
                plasticStraw.recycle();
            } else {
                System.err.println("recycle is not available for this Straw");
            }
        } else {
            System.err.println("null");
        }
    }
}
