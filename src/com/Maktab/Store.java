package com.Maktab;


import java.util.Arrays;

public class Store {
    private Radio[] radios = new Radio[5];
    private Television[] televisions = new Television[2];
    private Book[] books = new Book[1];
    private Magazine[] magazines = new Magazine[3];
    private SportShoe[] sportShoes = new SportShoe[4];
    private OxfordShoe[] oxfordShoes = new OxfordShoe[1];

    public void makeStore() {
        radios[0] = new Radio(1, 6, 1200);
        radios[1] = new Radio(2, 8, 1250);
        radios[2] = new Radio(3, 3, 430);
        radios[3] = new Radio(4, 20, 14000);
        radios[4] = new Radio(5, 14, 140);

        televisions[0] = new Television(1, 45, 8700);
        televisions[1] = new Television(2, 32, 18000);

        books[0] = new Book(1, 20, 80);

        magazines[0] = new Magazine(1, 56, 980);
        magazines[1] = new Magazine(2, 6, 1980);
        magazines[2] = new Magazine(3, 42, 540);

        sportShoes[0] = new SportShoe(1, 25, 98000);
        sportShoes[1] = new SportShoe(2, 25, 98500);
        sportShoes[2] = new SportShoe(3, 25, 98600);
        sportShoes[3] = new SportShoe(4, 25, 98800);

        oxfordShoes[0] = new OxfordShoe(1, 30, 10000);

    }

    public Radio[] getRadios() {
        return radios;
    }

    public Television[] getTelevisions() {
        return televisions;
    }

    public Book[] getBooks() {
        return books;
    }

    public Magazine[] getMagazines() {
        return magazines;
    }

    public SportShoe[] getSportShoes() {
        return sportShoes;
    }

    public OxfordShoe[] getOxfordShoes() {
        return oxfordShoes;
    }

    @Override
    public String toString() {
        return "Store{" + "\n" +
                "radios=" + Arrays.toString(radios) + "\n" +
                "televisions=" + Arrays.toString(televisions) + "\n" +
                "books=" + Arrays.toString(books) + "\n" +
                "magazines=" + Arrays.toString(magazines) + "\n" +
                "sportShoes=" + Arrays.toString(sportShoes) + "\n" +
                "oxfordShoes=" + Arrays.toString(oxfordShoes) + "\n" +
                '}';
    }
}
