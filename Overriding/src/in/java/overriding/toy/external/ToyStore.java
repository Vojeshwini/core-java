package in.java.overriding.toy.external59;

import in.java.overriding.toy.internal59.*;

public class ToyStore {
    public void showcase(Toy toy) {
        if (toy != null) {
            toy.play();
            if (toy instanceof Doll) {
                Doll doll = (Doll) toy;
                doll.price();
            } else {
                System.err.println("price is not available for this Toy");
            }
        } else {
            System.err.println("toy is null");
        }
    }
}
