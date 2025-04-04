package in.java.Cigratte;

import java.util.Objects;

public class Addiction {

    public Addiction(Cigratte cigratte) {
        System.out.println("Constructor Addiction");
        if (Objects.nonNull(cigratte)) {
            cigratte.smoke();
        }
        else
        {
            System.out.println("Null value occurred");
        }
    }

    public void smoke() {
        System.out.println("Addiction has harmful effects");
    }
    }
