package in.java.BlackAndWhite;

public class BlackAndWhiteRunner {
    public static void main(String[] args) {
        BlackAndWhite bnw = new BlackAndWhite();
        Price price = new Price(bnw);
        price.litre();
    }
}
