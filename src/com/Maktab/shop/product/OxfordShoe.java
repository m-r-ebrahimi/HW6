package com.Maktab.shop.product;

public class OxfordShoe extends Product {
    private String manufacturer;
    public OxfordShoe(int id, String name, int price, int count, String manufacturer) {
        super(id, name, price, count);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "OxfordShoe{" +super.toString() +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
