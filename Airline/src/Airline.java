public class Airline {
    int flightNumber;
    String airlineName;
    String source;
    String destination;
   double ticketPrice;
   int totalSeat;
   int availableSeats;
    int noOfPassager;
   String departureTime;
   String arrivalTime;

   public Airline(int flightNumber){
       this.flightNumber=flightNumber;

   }

   public Airline(int flightNumber,String airlineName){
       this(flightNumber);
       this.airlineName=airlineName;
   }

    public Airline(int flightNumber,String airlineName,String source){
        this(flightNumber,airlineName);
        this.source=source;
    }

    public Airline(int flightNumber,String airlineName,String source,String destination){
        this(flightNumber,airlineName,source);
        this.destination=destination;
    }

    public Airline(int flightNumber,String airlineName,String source,String destination,int ticketPrice){
        this(flightNumber,airlineName,source,destination);
        this.ticketPrice=ticketPrice;
    }
    public Airline(int flightNumber,String airlineName,String source,String destination,int ticketPrice,int totalSeat){
        this(flightNumber,airlineName,source,destination,ticketPrice);
        this.totalSeat=totalSeat;
    }

    public Airline(int flightNumber,String airlineName,String source,String destination,int ticketPrice,int totalSeat,int availableSeats){
        this(flightNumber,airlineName,source,destination,ticketPrice,totalSeat);
        this.availableSeats=availableSeats;
    }
    public Airline(int flightNumber,String airlineName,String source,String destination,int ticketPrice,int totalSeat,int availableSeats,int noOfPassager){
        this(flightNumber,airlineName,source,destination,ticketPrice,totalSeat,availableSeats);
        this.noOfPassager=noOfPassager;
    }
    public Airline(int flightNumber,String airlineName,String source,String destination,int ticketPrice,int totalSeat,int availableSeats,int noOfPassager,String departureTime){
        this(flightNumber,airlineName,source,destination,ticketPrice,totalSeat,availableSeats,noOfPassager);
        this.departureTime=departureTime;
    }

    public Airline(int flightNumber,String airlineName,String source,String destination,int ticketPrice,int totalSeat,int availableSeats,int noOfPassager,String departureTime,String arrivalTime){
        this(flightNumber,airlineName,source,destination,ticketPrice,totalSeat,availableSeats,noOfPassager,departureTime);
        this.arrivalTime=arrivalTime;
    }



    public void airlineInfo(){
        System.out.println("************************************");
        System.out.println("flightNumber:"+flightNumber);
       System.out.println("airlineName:"+airlineName);
       System.out.println("Source:"+source);
       System.out.println("destination:"+destination);
       System.out.println("ticketPrice:"+ticketPrice);
       System.out.println("totalSeat:"+totalSeat);
       System.out.println("availableSeat:"+availableSeats);
       System.out.println("noOfPassenger:"+noOfPassager);
       System.out.println("departureTime:"+departureTime);

    }

}
class AirlineRunner {
    public static void main(String[] args) {
        Airline airline1 = new Airline(4151);
        Airline airline2 = new Airline(4151, "Indigo");
        Airline airline3 = new Airline(5461, "Indigo", "India", "London");
        Airline airline4= new Airline(8525,"air india","bengaluru","delhi",5000,50);
        Airline airline5= new Airline(7525,"air india","delhi","bengaluru",5000,50);

        airline1.airlineInfo();
        airline2.airlineInfo();
        airline3.airlineInfo();
        airline4.airlineInfo();
        airline5.airlineInfo();
    }

}
