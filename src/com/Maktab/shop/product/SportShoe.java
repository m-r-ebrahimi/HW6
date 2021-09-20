package com.Maktab.shop.product;

public class SportShoe extends Product {
    private String manufacturer;

    public SportShoe() {
    }

    public SportShoe(int id, String name, int price, int count, String manufacturer) {
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
        return "SportShoe{" + super.toString() +
                " manufacturer='" + manufacturer + '\'' +
                '}' + "\n";
    }
}
