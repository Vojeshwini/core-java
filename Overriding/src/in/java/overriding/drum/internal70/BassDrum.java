package in.java.overriding.drum.internal70;
public class BassDrum extends Drum {

    @Override
    public void beat() {
        System.out.println("running the beat in BassDrum");
    }

    public void echo() {
        System.out.println("running the echo in BassDrum");
    }
}
