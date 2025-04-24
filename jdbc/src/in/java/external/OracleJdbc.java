package in.java.external;
import in.java.internal.*;


public class OracleJdbc implements Jdbc{

    @Override
    public void save() {
        System.out.println("running the save in oracle");
    }
}
