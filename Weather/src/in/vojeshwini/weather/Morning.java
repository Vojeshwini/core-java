package in.vojeshwini.weather;
import java.sql.SQLOutput;

import java.util.Objects;


public class Morning {
    String morning;
    String afternoon;
    String evening;
    Weather weather;


 public   Morning(String morning,String afternoon, String evening){
        this.morning=morning;
        this.afternoon=afternoon;
        this.evening=evening;
        System.out.println("banglore weather");
    }

    public void changesInWeather(){
System.out.println("running ");
        if(weather!=null) {
            weather.condition();

        }else{

            System.out.println("null has ocuured");
        }

    }



}
