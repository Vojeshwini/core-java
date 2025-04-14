package in.java.overriding.Clipboard.external39;
import in.java.overriding.Clipboard.internal39.*;



public class ClipboardUtility {
    public void useClipboard(Clipboard clipboard) {
        if (clipboard != null) {
            clipboard.hold();
            if (clipboard instanceof DigitalClipboard) {
                DigitalClipboard ref = (DigitalClipboard) clipboard;
                ref.copyText();
            } else {
                System.err.println("copyText is not DigitalClipboard");
            }
        } else {
            System.err.println("null");
        }
    }
}
