package com.Maktab;

public class SportShoe extends Shoes{
    private int id;
    private  int count = 0;
    private  int price;

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

}
