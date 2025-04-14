
package in.java.overriding.icecream.external4;
import in.java.overriding.icecream.internal4.*;

public class IceCreamAction {
    public void serveIceCream(IceCream iceCream) {
        if (iceCream != null) {
            iceCream.flavour();
            if (iceCream instanceof Vannila) {
                Vannila ref = (Vannila) iceCream;
                ref.pista();
            } else {
                System.err.println("pista is not available for this type of IceCream");
            }
        } else {
            System.err.println("null");
        }
    }
}
