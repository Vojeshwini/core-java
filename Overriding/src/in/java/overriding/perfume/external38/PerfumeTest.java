package in.java.overriding.perfume.external38;
import in.java.overriding.perfume.internal38.*;

public class PerfumeTest {
    public void testFragrance(Perfume perfume) {
        if (perfume != null) {
            perfume.fragrance();
            if (perfume instanceof FloralPerfume) {
                FloralPerfume ref = (FloralPerfume) perfume;
                ref.duration();
            } else {
                System.err.println("duration method is not available for this Perfume");
            }
        } else {
            System.err.println("null");
        }
    }
}
