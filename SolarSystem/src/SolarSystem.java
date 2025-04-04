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
        System.out.println("planet1:"+this.planet1);
    System.out.println("planet2:"+this.planet2);
    System.out.println("planet3:"+this.planet3);
    System.out.println("planet4:"+this.planet4);
    System.out.println("planet5:"+this.planet5);
    System.out.println("planet6:"+this.planet6);
    System.out.println("planet7:"+this.planet7);
    System.out.println("planet8:"+this.planet8);
    System.out.println("distance:"+this.distFromSunToEarth);
    System.out.println("biggestStar:"+this.biggestStar);


}

}

