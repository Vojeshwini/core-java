// Example: Keyboard
package in.java.overriding.keyboard.external88;
import in.java.overriding.keyboard.internal88.*;

public class KeyboardTest {
    public void testTyping(Keyboard keyboard) {
        if (keyboard != null) {
            keyboard.type();
            if (keyboard instanceof MechanicalKeyboard) {
                MechanicalKeyboard ref = (MechanicalKeyboard) keyboard;
                ref.backlight();
            } else {
                System.err.println("backlight is not available for this Keyboard");
            }
        } else {
            System.err.println("null");
        }
    }
}
