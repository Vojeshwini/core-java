package in.vojeshwini.gold;

public class GoldRunner {
    public static void main(String[] args) {
        String name = "kadga";
        Gold gold = new Gold();

        Bangal bangal = new Bangal(name, gold);
        bangal.size();


    }
}
