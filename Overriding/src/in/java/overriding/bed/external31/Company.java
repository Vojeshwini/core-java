package in.java.overriding.bed.external31;
import in.java.overriding.bed.internal31.*;


public class Company {
    public void brand(Bed bed){
        if(bed!=null){
            bed.comfort();
            if(bed instanceof KingSizeBed){
                KingSizeBed king=(KingSizeBed)bed;
                king.size();
            }
        }else{
            System.err.println("null");

        }
    }
}
