
package in.java.overriding.clip.external5;
import in.java.overriding.clip.internal5.*;

public class Holder {
    public void check(Clip clip) {
        if (clip != null) {
            clip.Material();
            if (clip instanceof Plastic) {
                Plastic ref = (Plastic) clip;
                ref.clipType();
            } else {
                System.err.println("clipType is not Plastic");
            }
        } else {
            System.err.println("null");
        }
    }
}
