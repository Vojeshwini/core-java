package in.java.overriding.television.internal42;

public class SmartTelevision extends Television {

    @Override
    public void display() {
        System.out.println("running the display in SmartTelevision");
    }

    public void connectToWiFi() {
        System.out.println("running the connectToWiFi in SmartTelevision");
    }
}

