package in.java.external.ext1;
import in.java.internal.int1.*;

public class Ticket {
   private Metro metro;

   public Ticket(Metro metro){
       this.metro=metro;
   }

   public void stopStation(){
       System.out.println("running the stopStation in the Ticket");
       if(this.metro!=null){
           this.metro.station();

       }else{
           System.err.println("this is null");
       }
   }


}
