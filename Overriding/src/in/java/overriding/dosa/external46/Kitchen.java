
package in.java.overriding.dosa.external46;
import in.java.overriding.dosa.internal46.*;

public class Kitchen {
    public void make(Dosa dosa) {
        if (dosa != null) {
            dosa.prepare();
            if (dosa instanceof MasalaDosa) {
                MasalaDosa ref = (MasalaDosa) dosa;
                ref.stuffing();
            } else {
                System.err.println("stuffing is not MasalaDosa");
            }
        } else {
            System.err.println("null");
        }
    }
}
