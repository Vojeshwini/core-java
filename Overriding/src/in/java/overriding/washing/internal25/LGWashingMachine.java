package in.java.overriding.washing.internal25;

public class LGWashingMachine extends WashingMachine {

    @Override
    public void brand() {
        System.out.println("running the brand in LGWashingMachine");
    }

    public void capacity() {
        System.out.println("running the capacity in LGWashingMachine");
    }
}

