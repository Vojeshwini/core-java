package in.java.overriding.Bird.internal1;

public class Feather extends Bird {

    @Override
    public void color(){
        System.out.println("Running the color in Feather");
    }

    public void category(){
        System.out.println("running the category in Feather");
        super.color();
    }
}
