package com.java.objects.internal;

import java.util.Objects;

public class Money {
    private String currency;
    private String country;
    private int denomination;
    private double value;

    public Money(String currency, String country, int denomination, double value) {
        this.currency = currency;
        this.country = country;
        this.denomination = denomination;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Money) {
            Money money = (Money) obj;
            if (Objects.equals(this.currency, money.currency) &&
                    Objects.equals(this.country, money.country) &&
                    this.denomination == money.denomination &&
                    this.value == money.value) {
                System.out.println("matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String Money");
        return "Currency=" + currency + ", Country=" + country + ", Denomination=" + denomination + ", Value=" + value;
    }
}
