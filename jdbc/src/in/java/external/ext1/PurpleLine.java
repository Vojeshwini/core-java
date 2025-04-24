package in.java.external.ext1;

import in.java.internal.int1.Metro;

public class PurpleLine implements Metro {
    @Override
    public void station() {
        System.out.println("running the statopn in Purpleine");
    }
}
