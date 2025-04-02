class SolarSystem {
    String planet1;
    String planet2;
    String planet3;
    String planet4;
    String planet5;
    String planet6;
    String planet7;
    String planet8;
    int distFromSunToEarth;
    String biggestStar;

    public SolarSystem(String planet1){

        this.planet1=planet1;
    }


    public SolarSystem(String planet1,String planet2){
        this(planet1);
        this.planet2=planet2;
    }


    public SolarSystem(String planet1,String planet2,String planet3){
        this(planet1,planet2);
        this.planet3=planet3;
    }

    public SolarSystem(String planet1,String planet2,String planet3,String planet4){
        this(planet1,planet2,planet3);
        this.planet4=planet4;
    }

    public SolarSystem(String planet1,String planet2,String planet3,String planet4,String planet5){
        this(planet1,planet2,planet3,planet4);
        this.planet5=planet5;
    }

    public SolarSystem(String planet1,String planet2,String planet3,String planet4,String planet5,String planet6){
        this(planet1,planet2,planet3,planet4,planet5);
        this.planet6=planet6;
    }



    public SolarSystem(String planet1,String planet2,String planet3,String planet4,String planet5,String planet6,String planet7){
        this(planet1,planet2,planet3,planet4,planet5,planet6);
        this.planet7=planet7;
    }

    public SolarSystem(String planet1,String planet2,String planet3,String planet4,String planet5,String planet6,String planet7,String planet8){
        this(planet1,planet2,planet3,planet4,planet5,planet6,planet7);
        this.planet8=planet8;
    }

    public SolarSystem(String planet1,String planet2,String planet3,String planet4,String planet5,String planet6,String planet7,String planet8,int distFromSunToEarth){
        this(planet1,planet2,planet3,planet4,planet5,planet6,planet7,planet8);
        this.distFromSunToEarth=distFromSunToEarth;
    }

    public SolarSystem(String planet1,String planet2,String planet3,String planet4,String planet5,String planet6,String planet7,String planet8,int distFromSunToEarth,String biggestStar){
        this(planet1,planet2,planet3,planet4,planet5,planet6,planet7,planet8,distFromSunToEarth);
        this.biggestStar=biggestStar;
    }
public void Info(){
        System.out.println("                                                              ");
        System.out.println("planet1:"+planet1);
    System.out.println("planet2:"+planet2);
    System.out.println("planet3:"+planet3);
    System.out.println("planet4:"+planet4);
    System.out.println("planet5:"+planet5);
    System.out.println("planet6:"+planet6);
    System.out.println("planet7:"+planet7);
    System.out.println("planet8:"+planet8);
    System.out.println("distance:"+distFromSunToEarth);
    System.out.println("biggestStar:"+biggestStar);


}

}

class SolarSystemRunner{
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
        solar1.Info();

    }
}