package in.java.overriding.animal.external14;
import in.java.overriding.animal.internal14.*;


public class Legs {
    public void herbivorous(Animal animal){
        if(animal!=null){
            animal.domestic();
            if(animal instanceof Carnivor) {
                Carnivor carnivor = (Carnivor) animal;
                carnivor.tiger();
            }else{
                System.err.println("animal is not a Carnivor");
            }
        }
        else{

            System.err.println("animal is bull");
        }
    }
}
