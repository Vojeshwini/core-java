package in.java.overriding.panipuri.internal92;
public class SpicyPanipuri extends Panipuri {

    @Override
    public void serve() {
        System.out.println("running the serve in SpicyPanipuri");
    }

    public void addExtraSpice() {
        System.out.println("running the addExtraSpice in SpicyPanipuri");
    }
}
