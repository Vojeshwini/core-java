
package in.java.overriding.file.external100;
import in.java.overriding.file.internal100.*;

public class FileManager {
    public void manageFile(File file) {
        if (file != null) {
            file.open();
            if (file instanceof PDFFile) {
                PDFFile ref = (PDFFile) file;
                ref.read();
            } else {
                System.err.println("read is not available for non-PDF files");
            }
        } else {
            System.err.println("null");
        }
    }
}
