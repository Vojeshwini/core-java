package in.java.overriding.guitar.internal89;
public class ElectricGuitar extends Guitar {

    @Override
    public void play() {
        System.out.println("running the play in ElectricGuitar");
    }

    public void plugIn() {
        System.out.println("running the plugIn in ElectricGuitar");
    }
}
