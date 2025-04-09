public class SolarSystemRunner {

        public static void main(String[] args) {
            String planet1="Mercury";
            String planet2="Venus";
            String planet3="Earth";
            String planet4="Mars";
            String planet5="jupiter";
            String planet6="staturn";
            String planet7="uranus";
            String planet8="nepture";
            int distFromSunToEarth=25000;
            String biggestStar="Sun";

            SolarSystem solar1=new SolarSystem(planet1,planet2,planet3,planet4,planet5,planet6,planet7,planet8,distFromSunToEarth,biggestStar);
            SolarSystem solar2=new SolarSystem(planet1,planet2,planet3,planet4,planet5,planet6,planet7,planet8,distFromSunToEarth);
            SolarSystem solar3=new SolarSystem(planet1,planet2,planet3,planet4);
            SolarSystem solar4=new SolarSystem(planet1,planet2,planet3,planet4,planet5,planet6,planet7);
            SolarSystem solar5=new SolarSystem(planet1,planet2,planet3,planet4,planet5,planet6);
            solar1.Info();
            solar2.Info();
            solar3.Info();
            solar4.Info();
            solar5.Info();

        }

}
