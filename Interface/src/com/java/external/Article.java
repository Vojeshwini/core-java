package com.java.external;
import com.java.internal.*;

public class Article implements Law{
    @Override
    public void rule(){
        System.out.println("runing the  Law");
    }

}
