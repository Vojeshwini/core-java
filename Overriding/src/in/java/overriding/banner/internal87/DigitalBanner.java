package in.java.overriding.banner.internal87;
public class DigitalBanner extends Banner {

    @Override
    public void display() {
        System.out.println("running the display in DigitalBanner");
    }

    public void animate() {
        System.out.println("running the animate in DigitalBanner");
    }
}

