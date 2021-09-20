package com.Maktab.shop.product;

public class Magazine extends Product {
    private String publisherName;

    public Magazine() {
    }

    public Magazine(int id, String name, int price, int count, String publisher) {
        super(id, name, price, count);
        publisherName = publisher;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "Magazine{" + super.toString() +
                " publisherName='" + publisherName + '\'' +
                '}' + "\n";
    }
}
