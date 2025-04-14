package in.java.overriding.cement.external75;
import in.java.overriding.cement.internal75.*;

public class Construction {
    public void use(Cement cement) {
        if (cement != null) {
            cement.mix();
            if (cement instanceof WhiteCement) {
                WhiteCement ref = (WhiteCement) cement;
                ref.shine();
            } else {
                System.err.println("decorate is not WhiteCement");
            }
        } else {
            System.err.println("null");
        }
    }
}