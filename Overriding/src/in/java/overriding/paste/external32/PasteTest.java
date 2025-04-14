package in.java.overriding.paste.external32;
import in.java.overriding.paste.internal32.*;

public class PasteTest {
    public void testUse(Paste paste) {
        if (paste != null) {
            paste.use();
            if (paste instanceof ToothPaste) {
                ToothPaste ref = (ToothPaste) paste;
                ref.flavor();
            } else {
                System.err.println("flavor method is not available for this Paste");
            }
        } else {
            System.err.println("null");
        }
    }
}
