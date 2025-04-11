package in.java.overriding.radio.internal66;
public class FMRadio extends Radio {

    @Override
    public void play() {
        System.out.println("running the play in FMRadio");
    }

    public void tune() {
        System.out.println("running the tune in FMRadio");
    }
}
