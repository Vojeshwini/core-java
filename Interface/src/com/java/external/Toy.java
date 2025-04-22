package com.java.external;

import com.java.internal.Doll;

public class Toy implements Doll {
    @Override
    public void hair() {
        System.out.println("running the hair in the Toy");
    }

    @Override
    public void dress() {
        System.out.println("running the dress in the Toy");
    }

    @Override
    public void eyes() {
        System.out.println("running the eyes in the Toy");
    }

    @Override
    public void voice() {
        System.out.println("running the voice in the Toy");
    }

    @Override
    public void size() {
        System.out.println("running the size in the Toy");
    }
}
