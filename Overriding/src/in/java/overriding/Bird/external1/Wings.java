package in.java.overriding.Bird.external1;
import in.java.overriding.Bird.internal1.*;

public class Wings {
    public void hight(Bird bird) {
        if (bird != null) {
            bird.color();
            if(bird instanceof Feather){
                Feather feather=(Feather)bird;
                feather.category();

            }
            else{
                System.err.println("bird with no feather");
            }
        }
        else {
            System.err.println("account is not digital");
        }
    }
}
