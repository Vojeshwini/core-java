package in.java.overriding.table.external73;

import in.java.overriding.table.internal73.*;

public class TableService {
    public void checkTable(Table table) {
        if (table != null) {
            table.support();
            if (table instanceof DiningTable) {
                DiningTable diningTable = (DiningTable) table;
                diningTable.serveFood();
            } else {
                System.err.println("serveFood method is not available for this Table");
            }
        } else {
            System.err.println("Table is null");
        }
    }
}
