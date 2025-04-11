package in.java.overriding.net.internal83;
public class FishingNet extends Net {

    @Override
    public void trap() {
        System.out.println("running the trap in FishingNet");
    }

    public void throwNet() {
        System.out.println("running the throwNet in FishingNet");
    }
}
