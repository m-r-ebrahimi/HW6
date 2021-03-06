package com.Maktab.shop.product;

public class Radio extends Product {
    private int power;

    public Radio() {
    }

    public Radio(int id, String name, int price, int count, int power) {
        super(id, name, price, count);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Radio{" + super.toString() +
                " power=" + power +
                '}' + "\n";
    }
}
