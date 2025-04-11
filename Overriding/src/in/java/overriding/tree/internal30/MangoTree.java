package in.java.overriding.tree.internal30;

public class MangoTree extends Tree {

    @Override
    public void grow() {
        System.out.println("running the grow in MangoTree");
    }

    public void fruit() {
        System.out.println("running the fruit in MangoTree");
    }
}
