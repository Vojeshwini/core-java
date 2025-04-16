package in.java.overriding.television.external42;

import in.java.overriding.television.internal42.*;

public class TelevisionService {
    public void check(Television tv) {
        if (tv != null) {
            tv.display();
            if (tv instanceof SmartTelevision) {
                SmartTelevision smartTV = (SmartTelevision) tv;
                smartTV.connectToWiFi();
            } else {
                System.err.println("connectToWiFi method is not available for this Television");
            }
        } else {
            System.err.println("Television is null");
        }
    }
}
