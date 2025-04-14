package in.java.overriding.photo.external50;
import in.java.overriding.photo.internal50.*;

public class PhotoTest {
    public void testCapture(Photo photo) {
        if (photo != null) {
            photo.capture();
            if (photo instanceof DigitalPhoto) {
                DigitalPhoto ref = (DigitalPhoto) photo;
                ref.resolution();
            } else {
                System.err.println("resolution method is not available for this Photo");
            }
        } else {
            System.err.println("null");
        }
    }
}
