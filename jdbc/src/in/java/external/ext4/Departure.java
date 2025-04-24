package in.java.external.ext4;
import in.java.internal.int4.*;

public class Departure {
    private AirLine airLine;

    public Departure(AirLine airLine){
        this.airLine=airLine;
    }

    public void source(){
        System.out.println("running the source in the Departure");
        if(this.airLine!=null){
            this.airLine.airPort();
        }else{
            System.err.println("airPort is null");
        }

    }


}
