package com.Maktab;

public class OxfordShoe extends Shoes{
    private int id;
    private  int count;
    private  int price;

    public OxfordShoe(int id, int count, int price) {
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

    public  int getCount() {
        return count;
    }

    public  void setCount(int count) {
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
        return "OxfordShoe{" +
                "id=" + id +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
