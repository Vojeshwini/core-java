package in.java.overriding.umbrella.internal43;

public class FoldingUmbrella extends Umbrella {

    @Override
    public void protect() {
        System.out.println("running the protect in FoldingUmbrella");
    }

    public void fold() {
        System.out.println("running the fold in FoldingUmbrella");
    }
}

