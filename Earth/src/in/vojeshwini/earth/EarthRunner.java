package in.vojeshwini.earth;

public class EarthRunner {
    public static void main(String[] args){

        Earth earth=new Earth();
        Plant plant=new Plant(earth);

        plant.rosePlant();
    }
}
