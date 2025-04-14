package in.java.overriding.Cloud.external2;
import in.java.overriding.Cloud.internal2.*;

public class Weather {
    public void forecast(Cloud cloud) {
        if (cloud != null) {
            cloud.cloudy();
            if (cloud instanceof Rainny) {
                Rainny ref = (Rainny) cloud;
                ref.blackCloudy();
            } else {
                System.err.println("blackCloudy is not Rainny");
            }
        } else {
            System.err.println("null");
        }
    }
}