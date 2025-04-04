package in.java.Property;

public class Property {
String layoutName;
int number;
Location[] location;



public Property(String layoutName,int number,Location[] location){
    this.layoutName=layoutName;
    this.number=number;
    this.location=location;
}

public void displayDetails(){
    System.out.println("layoutName="+layoutName+", number="+number);
   for(Location location:location){
    location.display();
   }
    }

}
