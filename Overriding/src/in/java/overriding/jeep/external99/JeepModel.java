
package in.java.overriding.jeep.external99;
import in.java.overriding.jeep.internal99.*;

public class JeepModel {
    public void displayModel(Jeep jeep) {
        if (jeep != null) {
            jeep.model();
            if (jeep instanceof Thar) {
                Thar ref = (Thar) jeep;
                ref.color();
            } else {
                System.err.println("color is not available for this type of Jeep");
            }
        } else {
            System.err.println("null");
        }
    }
}
