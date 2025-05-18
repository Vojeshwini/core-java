package com.java.webapp.dto;

public class Furnituredto {
    String productNumber;
    String brand;
    String material;
    String size;



    public void setProductNumber(String productNumber) {
        this.productNumber= productNumber;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }



    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public String getProductNumber() {
        return productNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }


    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Furnituredto{" +
                "productNumber='" + productNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
