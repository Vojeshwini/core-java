package in.java.tank;

public class Water {

    public Water() {
        System.out.println("running insde the water");
    }

    public void wtr() {
        Tank tank = new Tank();
        System.out.println("name of the tank is " + tank.getName());
        System.out.println("leaters of the tank is " + tank.getLtr());
        System.out.println("available capacity of the tank " + tank.getAvlbe());
        System.out.println("height of the tank is " + tank.getHeight());
        System.out.println("width of the tank is " + tank.getWidht());

        tank.setName("petrol");
        tank.setLtr(45);
        tank.setAvlbe(22);
        tank.setHeight(66);
        tank.setWidht(50);

        System.out.println("name of the tank is " + tank.getName());
        System.out.println("leaters of the tank is " + tank.getLtr());
        System.out.println("available capacity of the tank " + tank.getAvlbe());
        System.out.println("height of the tank is " + tank.getHeight());
        System.out.println("width of the tank is " + tank.getWidht());
    }
}
