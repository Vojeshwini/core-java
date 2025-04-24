package in.java.external;
import in.java.internal.*;

public class MysqlJdbc implements Jdbc{
    @Override
    public void save() {
        System.out.println("running the save in MysqlJdbc");
    }
}
