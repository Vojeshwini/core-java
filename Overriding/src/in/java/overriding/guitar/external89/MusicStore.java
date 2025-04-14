package in.java.overriding.guitar.external89;
import in.java.overriding.guitar.internal89.*;

public class MusicStore {
    public void showcase(Guitar guitar) {
        if (guitar != null) {
            guitar.play();
            if (guitar instanceof ElectricGuitar) {
                ElectricGuitar ref = (ElectricGuitar) guitar;
                ref.plugIn();
            } else {
                System.err.println("plugIn is not ElectricGuitar");
            }
        } else {
            System.err.println("null");
        }
    }
}