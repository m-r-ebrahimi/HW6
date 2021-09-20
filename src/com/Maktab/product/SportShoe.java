package com.Maktab.product;

public class SportShoe extends Product {
    private static int count = 0;

    public SportShoe(int id, String name, int price) {
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
        return "SportShoe{" + super.toString() + ", count=" + count + "}";
    }
}
