public class ElectronicsRunner {


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




