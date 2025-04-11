package in.java.overriding.door.internal34;

public class SlidingDoor extends Door {

    @Override
    public void open() {
        System.out.println("running the open in SlidingDoor");
    }

    public void lockType() {
        System.out.println("running the lockType in SlidingDoor");
    }
}

