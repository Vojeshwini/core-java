package in.Vojeshwini.Umbrella;
import java.util.Objects;

public class Brand {

    public Brand(Umbrella umbrella){
         if(Objects.nonNull(umbrella)) {
             umbrella.color();
         }else{
             System.out.println("non null occurs");
         }
    }

    public void price(){

        System.out.println("running the price");
    }



}
