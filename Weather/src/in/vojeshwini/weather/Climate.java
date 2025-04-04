package in.vojeshwini.weather;
import java.util.Objects;

public class Climate {
    public Climate(Weather weather) {
        System.out.println("Running constructor in climate");
        if (Objects.nonNull(weather)) {
            weather.forecast();
        } else {
            System.out.println("Null values detected");
        }
    }
    public void temperature(){
        System.out.println("Temperature is rising");
    }
}
