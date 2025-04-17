package com.java.objects.internal;
import java.util.Objects;


public class CupBoard {
    private String brand;
    private String type;
    private String color;
    private double price;

    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setPrice(double price){
        this.price=price;
    }
@Override
    public boolean equals(Object obj){
        if(obj!=null && obj instanceof CupBoard){
            CupBoard cupBoard=(CupBoard) obj;
            if(Objects.equals(this.brand,cupBoard.brand)&& Objects.equals(this.type,cupBoard.type)&& Objects.equals(this.color,cupBoard.color) && Objects.equals(this.price,cupBoard.price)){
                System.out.println("Matching");
                return true;

            }

        }
   return false;
}

@Override
    public String toString(){
    System.out.println("to String of Cupboard");
    return "Brand="+brand+",Type="+type+",Color="+color+",Price="+price;
}

}
