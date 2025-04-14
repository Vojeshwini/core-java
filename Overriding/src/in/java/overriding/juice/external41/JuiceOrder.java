
package in.java.overriding.juice.external41;
import in.java.overriding.juice.internal41.*;

public class JuiceOrder {
    public void serve(Juice juice) {
        if (juice != null) {
            juice.drink();
            if (juice instanceof OrangeJuice) {
                OrangeJuice ref = (OrangeJuice) juice;
                ref.vitaminCContent();
            } else {
                System.err.println("vitaminCContent is not available for this type of Juice");
            }
        } else {
            System.err.println("null");
        }
    }
}
