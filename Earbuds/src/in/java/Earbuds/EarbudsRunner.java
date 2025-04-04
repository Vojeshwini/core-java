package in.java.Earbuds;

public class EarbudsRunner {
    public static void main(String[] args) {
        Earbuds earbuds = new Earbuds();
        EarDamage earDamage = new EarDamage(earbuds);
        earDamage.damage();

}

}
