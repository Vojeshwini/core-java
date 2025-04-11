package in.java.overriding.helmet.internal86;
public class RacingHelmet extends Helmet {

    @Override
    public void protect() {
        System.out.println("running the protect in RacingHelmet");
    }

    public void adjustVisor() {
        System.out.println("running the adjustVisor in RacingHelmet");
    }
}

