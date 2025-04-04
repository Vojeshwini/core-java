package in.voj.kidney;
import  java.util.Objects;

public class Water {
    public Water(Kidney kidney){
        if(Objects.nonNull(kidney)){
            System.out.println("given reference id non null");
            kidney.human();
        }else{
            System.out.println("null occured");
        }
    }
    public void part(){
System.out.println("running the part");
    }


}
