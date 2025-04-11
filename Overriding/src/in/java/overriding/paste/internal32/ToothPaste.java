package in.java.overriding.paste.internal32;

public class ToothPaste extends Paste {

    @Override
    public void use() {
        System.out.println("running the use in ToothPaste");
    }

    public void flavor() {
        System.out.println("running the flavor in ToothPaste");
    }
}
