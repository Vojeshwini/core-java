package in.java.overriding.sun.external26;

import in.java.overriding.sun.internal26.*;

public class Sun {

    public void checkSun(Sun sun) {
        if (sun != null) {
            sun.shine();
            if (sun instanceof RisingSun) {
                RisingSun risingSun = (RisingSun) sun;
                risingSun.direction();
            } else {
                System.err.println("direction method is not available for this Sun");
            }
        } else {
            System.err.println("Sun is null");
        }
    }
}
