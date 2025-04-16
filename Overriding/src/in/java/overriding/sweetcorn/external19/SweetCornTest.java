package in.java.overriding.sweetcorn.external19;

import in.java.overriding.sweetcorn.internal19.*;

public class SweetCornTest{

    public void checkSweetCorn(SweetCorn sweetCorn) {
        if (sweetCorn != null) {
            if (sweetCorn instanceof Spicy) {
                Spicy spicyCorn = (Spicy) sweetCorn;
                spicyCorn.butterCorn();
            } else {
                System.err.println("butterCorn method is not available for this SweetCorn");
            }
        } else {
            System.err.println("SweetCorn is null");
        }
    }
}
