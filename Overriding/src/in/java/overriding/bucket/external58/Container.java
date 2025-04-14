package in.java.overriding.bucket.external58;
import in.java.overriding.bucket.internal58.*;

public class Container {
    public void size(Bucket bucket) {
        if (bucket != null) {
            bucket.fill();
            if (bucket instanceof PlasticBucket) {
                PlasticBucket ref = (PlasticBucket) bucket;
                ref.carry();
            } else {
                System.err.println("durability is not PlasticBucket");
            }
        } else {
            System.err.println("null");
        }
    }
}