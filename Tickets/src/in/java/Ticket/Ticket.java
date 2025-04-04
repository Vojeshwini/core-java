package in.java.Ticket;

public class Ticket {
    String passengerName;
    String source;
    String destination;
   int price;
    Bus[]  location ;

 public Ticket(String passengerName,String source,String destination,int price,Bus[] location){

     this.passengerName=passengerName;
     this.source=source;
     this.destination=destination;
     this.price=price;
      this.location=location;

 }
 public void displayDetails(){
     System.out.println("Name="+passengerName+"source="+source+"destination="+destination);
     for(Bus bus:location){
         bus.display();
     }
 }


}
