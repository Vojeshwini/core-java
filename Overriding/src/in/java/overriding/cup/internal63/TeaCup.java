package in.java.overriding.cup.internal63;
public class TeaCup extends Cup {

    @Override
    public void fill() {
        System.out.println("running the fill in TeaCup");
    }

    public void sip() {
        System.out.println("running the sip in TeaCup");
    }
}
