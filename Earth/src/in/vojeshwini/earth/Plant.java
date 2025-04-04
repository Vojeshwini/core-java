package in.vojeshwini.earth;
import java.sql.SQLOutput;
import java.util.Objects;

public class Plant {

    public Plant(Earth earth){
        if(Objects.nonNull(earth)){
            earth.tree();
        }
        else{
            System.out.println("null values occures");
        }


        System.out.println("Rose plant");

    }

public void rosePlant(){
        System.out.println("the fragnance is beautiful");
}
}
