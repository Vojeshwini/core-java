package in.voj.Liver;
import java.util.Objects;

public class HumanBody {
    public HumanBody(Liver liver){
        System.out.println("liver cancer for liver only");
        if(Objects.nonNull(liver)) {
            liver.Human();
        }
        else
        {
            System.out.println("Null values Occur");
        }
    }
    public void part(){
        System.out.println("Running in Cancer ");
    }
}



