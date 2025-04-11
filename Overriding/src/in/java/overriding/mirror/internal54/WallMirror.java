package in.java.overriding.mirror.internal54;
public class WallMirror extends Mirror {

    @Override
    public void reflect() {
        System.out.println("running the reflect in WallMirror");
    }

    public void hang() {
        System.out.println("running the hang in WallMirror");
    }
}
