package in.vojeshwini.weather;

public class MorningRunner {
    public static void main(String[] args){
        String morning="sunny";
        String afternoon="rainny";
        String evening="cloudy";

         Weather weather=new Weather("24C","cloudy");
         Morning morn=new Morning("sunny","rainny","dosth");


        morn.changesInWeather();
        weather.condition();

    }
}
