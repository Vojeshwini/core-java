package in.java.overriding.gun.internal51;
public class Pistol extends Gun {

    @Override
    public void shoot() {
        System.out.println("running the shoot in Pistol");
    }

    public void reload() {
        System.out.println("running the reload in Pistol");
    }
}

