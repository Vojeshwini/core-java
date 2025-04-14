package in.java.overriding.bat.external93;
import in.java.overriding.bat.internal93.*;


public class Wooden {
    public void material(Bat bat){
        if(bat!=null){
            bat.type();
            if(bat instanceof CricketBat){
                CricketBat cricketBat=(CricketBat)bat;
                cricketBat.weight();
            }else{
                System.out.println("bat is not cricket bat");
            }
        }

        else{
            System.err.println("null");
        }
    }
}
