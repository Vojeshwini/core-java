package in.java.external;
import in.java.internal.*;

public class Start extends AbstractProject {

    public void topic(){
        System.out.println("running the topic in subclass start");
    }

    @Override
    public void plan(){
        super.plan();
        System.out.println("running the concrete method");

    }




}
