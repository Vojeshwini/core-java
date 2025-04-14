package in.java.overriding.mic.external65;
import in.java.overriding.mic.internal65.*;

public class MicTest {
    public void testMic(Mic mic) {
        if (mic != null) {
            mic.record();
            if (mic instanceof WirelessMic) {
                WirelessMic ref = (WirelessMic) mic;
                ref.connect();
            } else {
                System.err.println("connect is not available for this Mic");
            }
        } else {
            System.err.println("null");
        }
    }
}
