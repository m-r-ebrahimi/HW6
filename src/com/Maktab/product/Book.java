package com.Maktab.product;

public class Book extends Product {
    private static int count = 0;

    public Book(int id, String name, int price) {
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
        return "Book{" + super.toString() + ", count=" + count + "}";
    }
}
