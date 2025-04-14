package in.java.overriding.brush.external49;
import in.java.overriding.brush.internal49.*;

public class Cleaning {
    public void scrub(Brush brush) {
        if (brush != null) {
            brush.clean();
            if (brush instanceof PaintBrush) {
                PaintBrush ref = (PaintBrush) brush;
                ref.paint();
            } else {
                System.err.println("smoothness is not ToothBrush");
            }
        } else {
            System.err.println("null");
        }
    }
}