package in.java.overriding.chips.internal64;
public class PotatoChips extends Chips {

    @Override
    public void taste() {
        System.out.println("running the taste in PotatoChips");
    }

    public void crunch() {
        System.out.println("running the crunch in PotatoChips");
    }
}
