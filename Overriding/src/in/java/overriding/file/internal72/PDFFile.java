package in.java.overriding.file.internal72;
public class PDFFile extends File {

    @Override
    public void open() {
        System.out.println("running the open in PDFFile");
    }

    public void read() {
        System.out.println("running the read in PDFFile");
    }
}
