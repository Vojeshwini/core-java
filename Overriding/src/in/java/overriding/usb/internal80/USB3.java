package in.java.overriding.usb.internal80;
public class USB3 extends USB {

    @Override
    public void connect() {
        System.out.println("running the connect in USB3");
    }

    public void fastTransfer() {
        System.out.println("running the fastTransfer in USB3");
    }
}

