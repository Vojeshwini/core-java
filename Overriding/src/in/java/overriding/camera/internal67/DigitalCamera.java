package in.java.overriding.camera.internal67;
public class DigitalCamera extends Camera {

    @Override
    public void capture() {
        System.out.println("running the capture in DigitalCamera");
    }

    public void zoom() {
        System.out.println("running the zoom in DigitalCamera");
    }
}
