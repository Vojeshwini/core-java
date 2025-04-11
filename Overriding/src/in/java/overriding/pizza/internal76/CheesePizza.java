package in.java.overriding.pizza.internal76;
public class CheesePizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("running the bake in CheesePizza");
    }

    public void addCheese() {
        System.out.println("running the addCheese in CheesePizza");
    }
}

