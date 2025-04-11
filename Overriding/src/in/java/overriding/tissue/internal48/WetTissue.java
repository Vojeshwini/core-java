package in.java.overriding.tissue.internal48;
public class WetTissue extends Tissue {

    @Override
    public void use() {
        System.out.println("running the use in WetTissue");
    }

    public void fragrance() {
        System.out.println("running the fragrance in WetTissue");
    }
}

