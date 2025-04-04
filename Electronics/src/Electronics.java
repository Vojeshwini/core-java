public class Electronics {
    String productName;
    double price;
    String brand;
    int noOfColorAvailable;
    String color1;
    String color2;
    String color3;
  long warrantyExpiration;
  String mfdIn;

  public Electronics(){


  }
  public Electronics(String productName) {
      this.productName = productName;
  }

    public Electronics(String productName,double price) {
        this(productName);
        this.price = price;
    }

    public Electronics(String productName,double price,String brand) {
        this(productName,price);
        this.brand = brand;
    }

    public Electronics(String productName,double price,String brand,int noOfColorAvailable) {
        this(productName,price,brand);
        this.noOfColorAvailable = noOfColorAvailable;
    }

    public Electronics(String productName,double price,String brand,int noOfColorAvailable,long warrantyExpiration) {
        this(productName,price,brand,noOfColorAvailable);
        this.warrantyExpiration = warrantyExpiration;
    }

    public void info(){
      System.out.println("**************************************************");
      System.out.println("productName:"+this.productName);
      System.out.println("price:"+this.price);
      System.out.println("brand:"+this.brand);
      System.out.println("noOfColorAvailable:"+this.noOfColorAvailable);
      System.out.println("warrtyExpiration"+this.warrantyExpiration);



    }




}


