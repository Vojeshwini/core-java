package in.java;
import in.java.external.ext1.GreenLine;
import in.java.external.ext2.Airtel;
import in.java.external.ext3.Bypass;
import in.java.external.ext3.NationalHighway;
import in.java.external.ext3.StateHighway;
import in.java.external.ext4.Departure;
import in.java.external.ext4.Hal;
import in.java.external.ext4.Indigo;
import in.java.internal.*;
import in.java.external.*;
import in.java.internal.int1.*;
import in.java.external.ext1.*;
import in.java.internal.int2.Network;
import in.java.external.ext2.*;
import in.java.internal.int3.Road;
import in.java.internal.int4.AirLine;
import in.java.external.ext4.*;


//using the functionality without knowing the implementation--abstraction

public class Runner {
    public static void main(String[] args) {
        Jdbc jdbc = new MysqlJdbc();//Loose Coupling
        Jdbc jdbc1=new OracleJdbc();
        IplApp iplApp = new IplApp(jdbc); //abstrction

        iplApp.saveTeam();
        //changing the implementation without changing the class
        System.out.println("-------------------------------------------------------------------------------");

        Metro metro=new GreenLine();
        Metro metro1=new PurpleLine();
        Ticket ticket=new Ticket(metro1);//here we can change the metro1 implemetation to metro implementatopn or vise vesa
        ticket.stopStation();
        System.out.println("----------------------------------------------------------------------------");
        Network network=new Jio();//or
        Network network1=new Airtel();
        Connect connect=new Connect(network);
        connect.connectHub();
        System.out.println("-----------------------------------------------------------------");
        Road road=new NationalHighway();
        Road road1=new StateHighway();
        Bypass bypass=new Bypass(road);
        bypass.roadJunction();
        System.out.println("----------------------------------------------------------------------");
        AirLine airLine=new Indigo();
        AirLine airLine1=new Hal();
        Departure departure=new Departure(airLine);
        departure.source();
        System.out.println("-------------------------------------------------------------");
    }
    }


