package in.java.overriding.camera.external67;
import in.java.overriding.camera.internal67.*;

public class Photography {
    public void click(Camera camera) {
        if (camera != null) {
            camera.capture();
            if (camera instanceof DigitalCamera) {
                DigitalCamera ref = (DigitalCamera) camera;
                ref.zoom();
            } else {
                System.err.println("adjustLens is not DSLR");
            }
        } else {
            System.err.println("null");
        }
    }
}