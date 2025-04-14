package in.java.overriding.mat.external47;
import in.java.overriding.mat.internal47.*;

public class MatTest {
    public void checkMat(Mat mat) {
        if (mat != null) {
            mat.use();
            if (mat instanceof YogaMat) {
                YogaMat ref = (YogaMat) mat;
                ref.thickness();
            } else {
                System.err.println("thickness is not available for this Mat");
            }
        } else {
            System.err.println("null");
        }
    }
}
