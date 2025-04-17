package in.java.overriding.pant.external40;
import in.java.overriding.pant.internal40.*;
public class PantTest {
    public void cloth(Pant pant){
        if(pant !=null){
            pant.wear();
            if(pant instanceof JeansPant){
                JeansPant jeansPant=(JeansPant)pant;
                jeansPant.fabric();
            }
        }else{
            System.err.println("jeans is null");
        }


    }
}
