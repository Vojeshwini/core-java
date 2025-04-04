package in.Vojeshwini.Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella();
        Brand brand = new Brand(umbrella);
      brand.price();
    }
}
