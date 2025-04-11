package in.java.overriding.needle.internal68;

public class SewingNeedle extends Needle {

    @Override
    public void pierce() {
        System.out.println("running the pierce in SewingNeedle");
    }

    public void stitch() {
        System.out.println("running the stitch in SewingNeedle");
    }
}

