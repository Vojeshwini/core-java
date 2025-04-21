package in.java;

import in.java.external.Foundation;
import in.java.external.NextStop;
import in.java.internal.AbstractMetro;
import in.java.internal.*;
import in.java.external.*;



public class runner {
    public static void main(String[] args){
        //Declare an abstract class with no abstract methods and extend it by a subclass. Create copy of subclass
        AbstractMetro abstractMetro=new NextStop();
        abstractMetro.source();
        //Declare an abstract class with abstract method and extend it by a subclass. Create copy of subclass

        AbstractBuilding abstractBuilding=new Foundation();
        abstractBuilding.material();

        //3. Declare an abstract class with one abstract method and one concrete method and extend it by a subclass. Create copy of subclass
   AbstractProject abstractProject=new Start();
   abstractProject.topic();
   abstractProject.plan();
    }

}
