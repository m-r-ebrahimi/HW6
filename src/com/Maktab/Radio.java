package com.Maktab;

public class Radio{
    private int id;
    private int count;
    private int price;

    public Radio(int id, int count, int price) {
        this.id = id;
        this.count = count;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "id=" + id +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
