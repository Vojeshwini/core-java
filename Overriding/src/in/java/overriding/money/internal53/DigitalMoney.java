package in.java.overriding.money.internal53;

public class DigitalMoney extends Money {

    @Override
    public void value() {
        System.out.println("running the value in DigitalMoney");
    }

    public void transaction() {
        System.out.println("running the transaction in DigitalMoney");
    }
}

