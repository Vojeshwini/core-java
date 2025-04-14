package in.java.overriding.bike.external28;
import in.java.overriding.bike.internal28.*;
public class CC {
    public void ccRange(Bike bike){
        if(bike !=null){
            bike.speed();
            if(bike instanceof SportsBike){
                SportsBike sports=(SportsBike) bike;
                sports.engine();
            }else {
                System.out.println("bike is not sports bike5");
            }
        }else{
            System.out.println("null");
        }

    }}
