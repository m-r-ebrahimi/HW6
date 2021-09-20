package com.Maktab.shop.store;


import com.Maktab.shop.product.*;

import java.util.Arrays;

public class Store {
    private Product[] radios = new Radio[5];
    private Product[] televisions = new Television[6];
    private Product[] books = new Book[5];
    private Product[] magazines = new Magazine[7];
    private Product[] sportShoes = new SportShoe[4];
    private Product[] oxfordShoes = new OxfordShoe[4];

    public void makeStore() {
        radios[0] = new Radio(1, "RF-P50D", 1200, 34, 10);
        radios[1] = new Radio(2, "ME-1115", 1250, 12, 12);
        radios[2] = new Radio(3, "MX_RA2114CT", 1430, 45, 12);
        radios[3] = new Radio(4, "ME-1133", 14000, 23, 10);
        radios[4] = new Radio(5, "RF-P35D", 14000, 4, 8);

        televisions[0] = new Television(1, "32BN2040J", 18700, 23, 40);
        televisions[1] = new Television(2, "50XKU575", 18000, 34, 40);
        televisions[2] = new Television(3, "SSD-55SA620U", 18050, 12, 45);
        televisions[3] = new Television(4, "43D3000i", 19450, 40, 60);
        televisions[4] = new Television(5, "50XKU500", 16930, 20, 45);
        televisions[5] = new Television(6, "GTV-50KU722S", 15000, 4, 30);


        books[0] = new Book(1, "En Dictionary", 80, 45, "Oxford");
        books[1] = new Book(2, "En Dictionary", 45, 45, "Long man");
        books[2] = new Book(3, "Fa Dictionary ", 76, 45, "Long man");
        books[3] = new Book(4, "Math", 23, 45, "Hor");
        books[4] = new Book(5, "Power Engineering", 100, 45, "Hor");

        magazines[0] = new Magazine(1, "Do you Know_1", 980, 34, "Oxford");
        magazines[1] = new Magazine(2, "Do you Know_2", 980, 34, "Oxford");
        magazines[2] = new Magazine(3, "Do you Know_3", 980, 34, "Oxford");
        magazines[3] = new Magazine(4, "Do you Know_4", 980, 34, "Oxford");
        magazines[4] = new Magazine(5, "Do you Know_5", 980, 34, "Oxford");
        magazines[5] = new Magazine(6, "Do you Know_6", 980, 34, "Oxford");
        magazines[6] = new Magazine(7, "Do you Know_7", 980, 34, "Oxford");

        sportShoes[0] = new SportShoe(1, "MU110", 98000, 100, "Tabriz");
        sportShoes[1] = new SportShoe(2, "MU111", 98000, 100, "Tabriz");
        sportShoes[2] = new SportShoe(3, "MU112", 98000, 100, "Tabriz");
        sportShoes[3] = new SportShoe(4, "MU113", 98000, 100, "Tabriz");

        oxfordShoes[0] = new OxfordShoe(1, "A21X", 10000, 80, "Tabriz");
        oxfordShoes[1] = new OxfordShoe(2, "A22X", 10000, 80, "Tabriz");
        oxfordShoes[2] = new OxfordShoe(3, "A23X", 10000, 80, "Tabriz");
        oxfordShoes[3] = new OxfordShoe(4, "A24X", 10000, 80, "Tabriz");

    }

    public Product[] getRadios() {
        return radios;
    }

    public Product[] getTelevisions() {
        return televisions;
    }

    public Product[] getBooks() {
        return books;
    }

    public Product[] getMagazines() {
        return magazines;
    }

    public Product[] getSportShoes() {
        return sportShoes;
    }

    public Product[] getOxfordShoes() {
        return oxfordShoes;
    }

    @Override
    public String toString() {
        return "Store{" + "\n" +
                "radios=" + Arrays.toString(radios) + "\n" +
                ", televisions=" + Arrays.toString(televisions) + "\n" +
                ", books=" + Arrays.toString(books) + "\n" +
                ", magazines=" + Arrays.toString(magazines) + "\n" +
                ", sportShoes=" + Arrays.toString(sportShoes) + "\n" +
                ", oxfordShoes=" + Arrays.toString(oxfordShoes) + "\n" +
                '}';
    }
}
