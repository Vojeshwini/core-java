package in.java.Property;

public class Location {
 String name;
 String houseName;

 public Location(String name,String houseName){
     this.name=name;
     this.houseName=houseName;

 }
 public void display(){
     System.out.println("name="+name+",houseName="+houseName);
 }
}
