package com.java.jsp.dto;

public class FeebackDto {
    String name;
    long n_contact;
    String message;

    public void setName(String name) {
        this.name = name;
    }

    public void setN_contact(long n_contact) {
        this.n_contact = n_contact;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public long getN_contact() {
        return n_contact;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "FeebackDto{" +
                "name='" + name + '\'' +
                ", n_contact=" + n_contact +
                ", message='" + message + '\'' +
                '}';
    }
}
