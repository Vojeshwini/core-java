package in.java.overriding.tree.external30;

import in.java.overriding.tree.internal30.*;

public class TreeInspector {
    public void inspect(Tree tree) {
        if (tree != null) {
            tree.grow();
            if (tree instanceof MangoTree) {
                MangoTree mango = (MangoTree) tree;
                mango.fruit();
            } else {
                System.err.println("fruit is not available for this Tree");
            }
        } else {
            System.err.println("tree is null");
        }
    }
}
