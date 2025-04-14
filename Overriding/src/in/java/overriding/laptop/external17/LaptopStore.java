package in.java.overriding.laptop.external17;
import in.java.overriding.laptop.internal17.*;

public class LaptopStore {
    public void showDetails(Laptop laptop) {
        if (laptop != null) {
            laptop.brand();
            if (laptop instanceof Asus) {
                Asus ref = (Asus) laptop;
                ref.color();
            } else {
                System.err.println("color is not Asus");
            }
        } else {
            System.err.println("null");
        }
    }
}