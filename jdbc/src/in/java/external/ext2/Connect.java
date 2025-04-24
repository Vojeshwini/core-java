package in.java.external.ext2;
import in.java.internal.int1.*;
import in.java.internal.int2.Network;

public class Connect {
    private Network network;
    public Connect(Network network){
        this.network=network;
    }

    public void connectHub(){
        System.out.println("running the connectHub in the Connect");
        if(this.network!=null){
            this.network.hub();
        }else{
            System.err.println("connectHub is null");
        }
    }

}
