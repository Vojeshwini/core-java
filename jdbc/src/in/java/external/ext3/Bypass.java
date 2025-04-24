package in.java.external.ext3;
import in.java.internal.int3.*;

public class Bypass {
    private Road road;

    public Bypass(Road road){
        this.road=road;
    }

    public void roadJunction(){
        System.out.println("running the roadJunction in the Bypass");
        if(this.road!=null){

            this.road.junction();
        }else{
            System.err.println("junction is  null");
        }
    }



}
