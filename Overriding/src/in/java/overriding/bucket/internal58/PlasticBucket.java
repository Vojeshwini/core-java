package in.java.overriding.bucket.internal58;
public class PlasticBucket extends Bucket {

    @Override
    public void fill() {
        System.out.println("running the fill in PlasticBucket");
    }

    public void carry() {
        System.out.println("running the carry in PlasticBucket");
    }
}

