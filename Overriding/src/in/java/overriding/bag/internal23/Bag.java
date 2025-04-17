package in.java.overriding.bag.internal23;

public class Bag {
    private String brand;
    private String color;

protected Bag(String brand,String color){
        this.brand=brand;
        this.color=color;
}


    public void type() {
        System.out.println("running the type in Bag");
    }

    @Override
    public String toString(){
        System.out.println("running  inside the toStrinng");
    return "brand:"+brand+"color="+color;
    }

}

