package in.java.overriding.bangle.external37;
import in.java.overriding.bangle.internal37.*;


public class Fancy {
    public void chain(Bangle bangle){
        if(bangle!=null){
            bangle.wear();
            if(bangle instanceof GoldBangle){
                GoldBangle goldBangle=(GoldBangle)bangle;
                goldBangle.purity();
            }else{
                System.err.println("bangle is bot a gold");
            }
        }else{
            System.err.println("nagle is null null");
        }

    }
}
