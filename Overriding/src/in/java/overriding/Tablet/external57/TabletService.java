package in.java.overriding.Tablet.external57;

import in.java.overriding.Tablet.internal57.*;

public class TabletService {
    public void checkTablet(Tablet tablet) {
        if (tablet != null) {
            tablet.powerOn();
            if (tablet instanceof AndroidTablet) {
                AndroidTablet androidTablet = (AndroidTablet) tablet;
                androidTablet.installApp();
            } else {
                System.err.println("installApp method is not available for this Tablet");
            }
        } else {
            System.err.println("Tablet is null");
        }
    }
}
