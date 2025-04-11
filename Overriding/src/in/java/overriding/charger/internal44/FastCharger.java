package in.java.overriding.charger.internal44;


    public class FastCharger extends Charger {

        @Override
        public void charge() {
            System.out.println("running the charge in FastCharger");
        }

        public void outputPower() {
            System.out.println("running the outputPower in FastCharger");
        }
    }

