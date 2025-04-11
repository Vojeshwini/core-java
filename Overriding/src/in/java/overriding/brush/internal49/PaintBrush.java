package in.java.overriding.brush.internal49;
public class PaintBrush extends Brush {

    @Override
    public void clean() {
        System.out.println("running the clean in PaintBrush");
    }

    public void paint() {
        System.out.println("running the paint in PaintBrush");
    }
}

