package in.java.BlackAndWhite;
import java.util.Objects;
public class Price
{

    public Price(BlackAndWhite blackAndWhite){

        System.out.println("running color");
        if(Objects.nonNull(blackAndWhite)){
            blackAndWhite.brand();
        }else{
            System.out.println("null  occurence");
        }
    }

    public void litre(){
        System.out.println("12 l");
    }



}
