package in.java.overriding.mirror.external54;
import in.java.overriding.mirror.internal54.*;

public class MirrorTest {
    public void testReflection(Mirror mirror) {
        if (mirror != null) {
            mirror.reflect();
            if (mirror instanceof WallMirror) {
                WallMirror ref = (WallMirror) mirror;
                ref.hang();
            } else {
                System.err.println("hang is not available for this Mirror");
            }
        } else {
            System.err.println("null");
        }
    }
}
