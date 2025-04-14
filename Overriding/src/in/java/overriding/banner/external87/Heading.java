package in.java.overriding.banner.external87;
import in.java.overriding.banner.internal87.*;

public class Heading {
    public void subHeading(Banner banner){
        if(banner!=null){
            banner.display();
            if(banner instanceof DigitalBanner){
                DigitalBanner digitalBanner=(DigitalBanner)banner;
                digitalBanner.animate();
            }else{
                System.err.println("animate is not digital");
            }
        }else{
            System.err.println("null");
        }
    }
}
