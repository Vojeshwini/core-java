package in.vojeshwini.weather;

public class Weather {
    String temperature;
    String condition;


    public Weather(String temperature,String condition){
        this.temperature=temperature;
        this.condition=condition;
        System.out.println("todays weather");

    }
    public void condition(){

        System.out.println("temperature="+this.temperature);
       System.out.println("condition="+this.condition);
    }




}
