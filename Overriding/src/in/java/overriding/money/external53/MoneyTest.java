package in.java.overriding.money.external53;
import in.java.overriding.money.internal53.*;

public class MoneyTest {
    public void testValue(Money money) {
        if (money != null) {
            money.value();
            if (money instanceof DigitalMoney) {
                DigitalMoney ref = (DigitalMoney) money;
                ref.transaction();
            } else {
                System.err.println("transaction is not available for this Money");
            }
        } else {
            System.err.println("null");
        }
    }
}
