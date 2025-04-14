package in.java.overriding.scale.external69;
import in.java.overriding.scale.internal69.*;

public class ScaleTest {
    public void testMeasure(Scale scale) {
        if (scale != null) {
            scale.measure();
            if (scale instanceof MeasuringScale) {
                MeasuringScale ref = (MeasuringScale) scale;
                ref.calibrate();
            } else {
                System.err.println("calibrate is not available for this Scale");
            }
        } else {
            System.err.println("null");
        }
    }
}
