package in.java.overriding.mic.internal65;
public class WirelessMic extends Mic {

    @Override
    public void record() {
        System.out.println("running the record in WirelessMic");
    }

    public void connect() {
        System.out.println("running the connect in WirelessMic");
    }
}
