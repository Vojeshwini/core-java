package in.vojeshwini.Sweet;
import java.sql.SQLOutput;
import java.util.Objects;
public class Variety {

public Variety(Sweet sweet){
    System.out.println("running the constructor in varieties");
    if(Objects.nonNull(sweet)){
        sweet.barfi();

    }else{
        System.out.println("null values found");
    }

}

public void barfi(){
    System.out.print("good taste");
}


}
