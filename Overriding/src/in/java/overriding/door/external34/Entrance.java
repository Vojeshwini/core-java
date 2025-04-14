
package in.java.overriding.door.external34;
import in.java.overriding.door.internal34.*;

public class Entrance {
    public void access(Door door) {
        if (door != null) {
            door.open();
            if (door instanceof SlidingDoor) {
                SlidingDoor ref = (SlidingDoor) door;
                ref.lockType();
            } else {
                System.err.println("lockType is not SlidingDoor");
            }
        } else {
            System.err.println("null");
        }
    }
}
