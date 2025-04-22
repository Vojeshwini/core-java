package com.java.external;

import com.java.internal.Hanger;

public class Hook implements Hanger {
    @Override
    public void hook() {
        System.out.println("running the hook in the Hook");
    }

    @Override
    public void rod() {
        System.out.println("running the rod in the Hook");
    }

    @Override
    public void clip() {
        System.out.println("running the clip in the Hook");
    }

    @Override
    public void grip() {
        System.out.println("running the grip in the Hook");
    }

    @Override
    public void material() {
        System.out.println("running the material in the Hook");
    }
}
