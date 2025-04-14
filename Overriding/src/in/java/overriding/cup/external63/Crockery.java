
package in.java.overriding.cup.external63;
import in.java.overriding.cup.internal63.*;

public class Crockery {
    public void useCup(Cup cup) {
        if (cup != null) {
            cup.fill();
            if (cup instanceof TeaCup) {
                TeaCup ref = (TeaCup) cup;
                ref.sip();
            } else {
                System.err.println("sip is not TeaCup");
            }
        } else {
            System.err.println("null");
        }
    }
}