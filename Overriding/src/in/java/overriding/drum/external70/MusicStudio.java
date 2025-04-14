
package in.java.overriding.drum.external70;
import in.java.overriding.drum.internal70.*;

public class MusicStudio {
    public void play(Drum drum) {
        if (drum != null) {
            drum.beat();
            if (drum instanceof BassDrum) {
                BassDrum ref = (BassDrum) drum;
                ref.echo();
            } else {
                System.err.println("echo is not BassDrum");
            }
        } else {
            System.err.println("null");
        }
    }
}
