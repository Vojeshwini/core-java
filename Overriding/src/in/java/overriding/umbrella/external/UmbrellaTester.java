package in.java.overriding.umbrella.external43;

import in.java.overriding.umbrella.internal43.*;

public class UmbrellaTester {
    public void check(Umbrella umbrella) {
        if (umbrella != null) {
            umbrella.protect();
            if (umbrella instanceof FoldingUmbrella) {
                FoldingUmbrella folding = (FoldingUmbrella) umbrella;
                folding.fold();
            } else {
                System.err.println("fold is not available for this Umbrella");
            }
        } else {
            System.err.println("umbrella is null");
        }
    }
}
