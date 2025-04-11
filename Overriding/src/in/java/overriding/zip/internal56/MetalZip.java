package in.java.overriding.zip.internal56;
public class MetalZip extends Zip {

    @Override
    public void close() {
        System.out.println("running the close in MetalZip");
    }

    public void strength() {
        System.out.println("running the strength in MetalZip");
    }
}

