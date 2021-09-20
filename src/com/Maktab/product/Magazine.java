package com.Maktab.product;

public class Magazine extends Product {
    private static int count = 0;

    public Magazine(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    void add(int num) {
        count += num;
    }

    @Override
    void remove(int num) {
        count -= num;
    }

    @Override
    public String toString() {
        return "Magazine{" + super.toString() + ", count=" + count + "}";
    }
}
