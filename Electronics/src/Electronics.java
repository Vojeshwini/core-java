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


class ElectronicsRunner{
    public static void main(String[] args){
        String productName="Smart Phone";
        double price=25000.25;
        String brand="Samsung";
        int noOfColorAvailabl=3;
        String color1="White";
        String color2="Black";
        String color3="Mint";
        long warrantyExpiration=2;
        String mfdIn="India";



        Electronics elect1=new Electronics();
        Electronics elect2=new Electronics(productName,price,brand,noOfColorAvailabl,warrantyExpiration);
        Electronics elect3=new Electronics(productName,price,brand,noOfColorAvailabl);
        Electronics elect4=new Electronics(productName,price,brand);
        Electronics elect5=new Electronics(productName,price);
        Electronics elect6=new Electronics(productName);

        elect1.info();
        elect2.info();
        elect3.info();
        elect4.info();
        elect5.info();
        elect6.info();

    }


}
