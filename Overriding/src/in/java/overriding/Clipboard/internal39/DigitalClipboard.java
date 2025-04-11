package in.java.overriding.Clipboard.internal39;
public class DigitalClipboard extends Clipboard {

    @Override
    public void hold() {
        System.out.println("running the hold in DigitalClipboard");
    }

    public void copyText() {
        System.out.println("running the copyText in DigitalClipboard");
    }
}

