package in.java.overriding.Bird.external1;
import in.java.overriding.Bird.internal1.*;

public class Wings {
    public void hight(Bird bird) {
        if (bird != null) {
            System.out.println("running in wings");

            bird.color();
            if(bird instanceof Feather){
                Feather feather=(Feather)bird;
                System.out.println("running in wings2");
                feather.category();

            }
            else{
                System.err.println("bird with no feather");
            }
        }
        else {
            System.err.println("bird is not height");
        }
    }
}
