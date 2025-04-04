package in.java.Property;

public class PropertyRunner {
    public static void main(String[] args) {
        Location loc1 = new Location("hsr", "maagulu");
        Location loc2 = new Location("basavanagudi", "maagulu");
        Property property = new Property("mico", 45, new Location[]{loc1, loc2});
        property.displayDetails();
    }
}
