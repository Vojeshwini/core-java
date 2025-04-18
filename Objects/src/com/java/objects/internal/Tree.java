package com.java.objects.internal;
import java.util.Objects;
public class Tree {
    private String name;
    private double height;

    public void setName(String name){
        this.name=name;
    }
    public void setHeight(double height){
        this.height=height;
    }
    @Override
    public boolean equals(Object obj){
        if(obj!=null && obj instanceof Tree){
            Tree tree=(Tree)obj;
            if(Objects.equals(this.name,tree.name) && Objects.equals(this.height,tree.height)){
                System.out.println("matching");
                return true;

            }
        }


        return false;
    }
    @Override
    public String toString(){
        System.out.println("toSting in Tree");
        return "Name="+name+",Height="+height;

    }



}
