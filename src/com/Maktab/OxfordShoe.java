package com.Maktab;

public class OxfordShoe extends Shoes{
    private int id;
    private static int count = 0;
    private final int price=10000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        OxfordShoe.count = count;
    }

    public int getPrice() {
        return price;
    }

}
