package in.java;
import in.java.internal.*;
import in.java.external.*;

//using the functionality without knowing the implementation--abstraction

public class Runner {
    public static void main(String[] args) {
        Jdbc jdbc = new MysqlJdbc(); //Loose Coupling
        IplApp iplApp = new IplApp(jdbc); //abstrction
        iplApp.saveTeam();
    }
    }


