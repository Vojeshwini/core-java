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
        System.out.println("flightNumber:"+this.flightNumber);
       System.out.println("airlineName:"+this.airlineName);
       System.out.println("Source:"+this.source);
       System.out.println("destination:"+this.destination);
       System.out.println("ticketPrice:"+this.ticketPrice);
       System.out.println("totalSeat:"+this.totalSeat);
       System.out.println("availableSeat:"+this.availableSeats);
       System.out.println("noOfPassenger:"+this.noOfPassager);
       System.out.println("departureTime:"+this.departureTime);

    }

}

