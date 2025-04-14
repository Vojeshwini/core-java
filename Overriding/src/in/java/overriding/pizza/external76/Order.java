package in.java.overriding.pizza.external76;
import in.java.overriding.pizza.internal76.*;

public class Order {
    public void serve(Pizza pizza) {
        if (pizza != null) {
            pizza.bake();
            if (pizza instanceof CheesePizza) {
                CheesePizza ref = (CheesePizza) pizza;
                ref.addCheese();
            } else {
                System.err.println("extraCheese is not CheesePizza");
            }
        } else {
            System.err.println("null");
        }
    }
}
