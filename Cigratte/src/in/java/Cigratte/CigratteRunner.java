package in.java.Cigratte;

public class CigratteRunner {
    public static void main(String[] args) {
        Cigratte cigratte = new Cigratte();
        Addiction addiction = new Addiction(cigratte);
        cigratte.smoke();
}

}
