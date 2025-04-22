package com.java.external.ext7;
import com.java.internal.int7.*;

public class Stem implements Root{
    public void primaryRoot(){
        System.out.println("running the primary root in the Stem");
    }

    @Override
    public void flower() {
        System.out.println("running the flower in the stem");
    }
}
