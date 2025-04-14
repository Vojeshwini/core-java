package in.java.overriding.radio.external66;
import in.java.overriding.radio.internal66.*;

public class RadioTest {
    public void testPlay(Radio radio) {
        if (radio != null) {
            radio.play();
            if (radio instanceof FMRadio) {
                FMRadio ref = (FMRadio) radio;
                ref.tune();
            } else {
                System.err.println("tune method is not available for this Radio");
            }
        } else {
            System.err.println("null");
        }
    }
}
