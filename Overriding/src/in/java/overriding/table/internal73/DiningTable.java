package in.java.overriding.table.internal73;
public class DiningTable extends Table {

    @Override
    public void support() {
        System.out.println("running the support in DiningTable");
    }

    public void serveFood() {
        System.out.println("running the serveFood in DiningTable");
    }
}

