package in.java.overriding.keyboard.internal88;
public class MechanicalKeyboard extends Keyboard {

    @Override
    public void type() {
        System.out.println("running the type in MechanicalKeyboard");
    }

    public void backlight() {
        System.out.println("running the backlight in MechanicalKeyboard");
    }
}
