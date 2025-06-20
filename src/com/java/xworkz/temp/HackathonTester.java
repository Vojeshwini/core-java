package com.java.xworkz.temp;

public class HackathonTester {
    public static void main(String[] args) {
        try(HackResource hackResource=new HackResource();){
            hackResource.open();
        }
    }

}
