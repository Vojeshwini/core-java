package com.java.external;

import com.java.internal.Railway;

public class Source implements Railway {
    @Override
    public void coach() {
        System.out.println("running the coach in the Source");
    }

    @Override
    public void seat() {
        System.out.println("running the seat in the Source");

    }

    @Override
    public void track() {
        System.out.println("running the track in the Source");

    }

    @Override
    public void flag() {
        System.out.println("running the flag in the Source");

    }

    @Override
    public void signal() {
        System.out.println("running the signal in the Source");

    }
}
