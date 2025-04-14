package in.java.overriding.pipe.external82;
import in.java.overriding.pipe.internal82.*;

public class Flow {
    public void transport(Pipe pipe) {
        if (pipe != null) {
            pipe.carry();
            if (pipe instanceof PVCpipe) {
                PVCpipe ref = (PVCpipe) pipe;
                ref.bend();
            } else {
                System.err.println("durability is not SteelPipe");
            }
        } else {
            System.err.println("null");
        }
    }
}
