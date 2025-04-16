package in.java.overriding.zip.external56;

import in.java.overriding.zip.internal56.*;

public class ZipTest {
    public void testClose(Zip zip) {
        if (zip != null) {
            zip.close();
            if (zip instanceof MetalZip) {
                MetalZip metalZip = (MetalZip) zip;
                metalZip.strength();
            } else {
                System.err.println("strength is not available for this Zip");
            }
        } else {
            System.err.println("zip is null");
        }
    }
}
