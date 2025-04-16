package in.java.overriding.tissue.external48;

import in.java.overriding.tissue.internal48.*;

public class TissueBox {
    public void apply(Tissue tissue) {
        if (tissue != null) {
            tissue.use();
            if (tissue instanceof WetTissue) {
                WetTissue wetTissue = (WetTissue) tissue;
                wetTissue.fragrance();
            } else {
                System.err.println("fragrance method is not available for this Tissue");
            }
        } else {
            System.err.println("tissue is null");
        }
    }
}
