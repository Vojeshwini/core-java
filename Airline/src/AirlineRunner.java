public class AirlineRunner {

        public static void main(String[] args) {
            Airline airline1 = new Airline(4151);
            Airline airline2 = new Airline(4151, "Indigo");
            Airline airline3 = new Airline(5461, "Indigo", "India", "London");
            Airline airline4 = new Airline(8525, "air india", "bengaluru", "delhi", 5000, 50);
            Airline airline5 = new Airline(7525, "air india", "delhi", "bengaluru", 5000, 50, 230);
            Airline airline6 = new Airline(7525, "air india", "delhi", "bengaluru", 5000, 250, 50, 200, "2.00 am", "4 am");

            airline1.airlineInfo();
            airline2.airlineInfo();
            airline3.airlineInfo();
            airline4.airlineInfo();
            airline5.airlineInfo();


        }
}
