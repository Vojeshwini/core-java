package in.java.Ticket;

public class TicketRunner {
    public static void main(String[] args){

        Bus bus1=new Bus(35,"red");
        Bus bus2=new Bus(65,"Purple");
        Ticket ticket= new Ticket("ravi","btm","mejestic",30, new Bus[] {bus1,bus2});

   ticket.displayDetails();
    }
}
