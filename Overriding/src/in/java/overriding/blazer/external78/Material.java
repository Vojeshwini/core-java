package in.java.overriding.blazer.external78;

import in.java.overriding.blazer.internal78.Blazer;
import in.java.overriding.blazer.internal78.FormalBlazer;

public class Material {
    public void color(Blazer blazer){
        if(blazer!=null){
            blazer.wear();
            if(blazer instanceof FormalBlazer){
                FormalBlazer ref=(FormalBlazer)blazer ;
                ref.matchWithTie();
            }else{
                System.out.println("blazer id not match with tiee");
            }
        }else{
            System.out.println("null");
        }
    }

}
