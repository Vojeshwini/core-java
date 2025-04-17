package com.java.objects.internal;
import java.util.Objects;

public class Chocolate {
    private String brand;
    private String name;
    private int price;
    private String flavour;

public Chocolate(String brand,String name,int price,String flavour){
    this.brand=brand;
    this.name=name;
    this.price=price;
    this.flavour=flavour;
}
//this=left (this== obj) obj=right left.equals(right)
@Override
    public boolean equals(Object obj) {
    if (obj != null && obj instanceof Chocolate) {
        Chocolate chocolate = (Chocolate) obj;
        if (Objects.equals(this.brand, chocolate.brand) && Objects.equals(this.name, chocolate.name)) {
            System.out.println("the string is matching");
            return true;
        }
    }
    return false;
}
    @Override
            public String toString(){
        return "Brand="+brand+ ",Name="+name+ ",Price="+price+ ",flavour="+flavour;
}


}
