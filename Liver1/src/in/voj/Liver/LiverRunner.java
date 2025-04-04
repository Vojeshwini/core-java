package in.voj.Liver;

public class LiverRunner {
    public static void main(String[] args) {
        Liver liver = new Liver();
        HumanBody humanBody = new HumanBody(liver);
        humanBody.part();

    }
}
