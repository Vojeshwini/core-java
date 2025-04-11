package in.java.overriding.scale.internal69;
public class MeasuringScale extends Scale {

    @Override
    public void measure() {
        System.out.println("running the measure in MeasuringScale");
    }

    public void calibrate() {
        System.out.println("running the calibrate in MeasuringScale");
    }
}

