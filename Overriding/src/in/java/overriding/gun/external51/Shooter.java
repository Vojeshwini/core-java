package in.java.overriding.gun.external51;
import in.java.overriding.gun.internal51.*;

public class Shooter {
    public void fireWeapon(Gun gun) {
        if (gun != null) {
            gun.shoot();
            if (gun instanceof Pistol) {
                Pistol ref = (Pistol) gun;
                ref.reload();
            } else {
                System.err.println("reload is not available for this gun");
            }
        } else {
            System.err.println("null");
        }
    }
}