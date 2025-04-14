package in.java.overriding.Battery.external21;
import in.java.overriding.Battery.internal21.*;

public class Brand {
    public void everyDay(Battery battery) {
        if (battery != null) {
            battery.type();
if(battery instanceof Exide){
    Exide ref=(Exide)battery;
    ref.capacity();

}
        } else {
System.out.println("null");

        }
    }
}
