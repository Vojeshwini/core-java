package in.java.overriding.photo.internal50;


    public class DigitalPhoto extends Photo {

        @Override
        public void capture() {
            System.out.println("running the capture in DigitalPhoto");
        }

        public void resolution() {
            System.out.println("running the resolution in DigitalPhoto");
        }
    }


