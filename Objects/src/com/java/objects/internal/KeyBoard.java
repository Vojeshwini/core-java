package com.java.objects.internal;

import java.util.Objects;

public class KeyBoard {
    private String brand;
    private String type;
    private String color;
    private int price;

    public KeyBoard(String brand, String type, String color, int price) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) obj;
            if (Objects.equals(this.brand, keyBoard.brand) &&
                    Objects.equals(this.type, keyBoard.type) &&
                    Objects.equals(this.color, keyBoard.color) &&
                    this.price == keyBoard.price) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String KeyBoard");
        return "Brand=" + brand + ", Type=" + type + ", Color=" + color + ", Price=" + price;
    }
}
