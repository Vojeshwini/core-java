package in.voj.kidney;

public class KidneyRunner {
    public static void main(String[] args){
        Kidney kidney=new Kidney();
        Water water=new Water(kidney);
        water.part();
    }
}
