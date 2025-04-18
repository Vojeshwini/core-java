package com.java.objects.internal;

import java.util.Objects;

public class Ticket {
    private String eventName;
    private String seatNumber;
    private String date;
    private double price;

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Ticket) {
            Ticket ticket = (Ticket) obj;
            if (Objects.equals(this.eventName, ticket.eventName) &&
                    Objects.equals(this.seatNumber, ticket.seatNumber) &&
                    Objects.equals(this.date, ticket.date) &&
                    Objects.equals(this.price, ticket.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Ticket");
        return "EventName=" + eventName + ",SeatNumber=" + seatNumber + ",Date=" + date + ",Price=" + price;
    }
}
