package in.java.overriding.cap.external94;
import in.java.overriding.cap.internal94.*;

public class Headwear {
    public void wear(Cap cap) {
        if (cap != null) {
            cap.wear();
            if (cap instanceof SportsCap) {
                SportsCap ref = (SportsCap) cap;
                ref.adjustStrap();
            } else {
                System.err.println("adjustBrim is not BaseballCap");
            }
        } else {
            System.err.println("null");
        }
    }
}