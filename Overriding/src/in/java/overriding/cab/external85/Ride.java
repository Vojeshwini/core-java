package in.java.overriding.cab.external85;
import in.java.overriding.cab.internal85.*;

public class Ride {
    public void travel(Cab cab) {
        if (cab != null) {
            cab.ride();
            if (cab instanceof OlaCab) {
                OlaCab ref = (OlaCab) cab;
                ref.book();
            } else {
                System.err.println("luxuryFeatures is not SedanCab");
            }
        } else {
            System.err.println("null");
        }
    }
}