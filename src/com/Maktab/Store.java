package com.Maktab;

import java.util.ArrayList;

public class Store {
    ArrayList<Radio> radios=new ArrayList();
    ArrayList<Television> televisions=new ArrayList();
    ArrayList<Book> books=new ArrayList();
    ArrayList<Magazine> magazines=new ArrayList();
    ArrayList<SportShoe> sportShoes=new ArrayList();
    ArrayList<OxfordShoe> oxfordShoes=new ArrayList();
    public void makeStore(){
        Radio radio1=new Radio(1,6,1200);
        Radio radio2=new Radio(2,8,1250);
        Radio radio3=new Radio(3,3,430);
        Radio radio4=new Radio(4,20,14000);
        Radio radio5=new Radio(5,14,140);
        radios.add(radio1);
        radios.add(radio2);
        radios.add(radio3);
        radios.add(radio4);
        radios.add(radio5);
        Television television1=new Television(1,45,8700);
        Television television2=new Television(2,32,18000);
        televisions.add(television1);
        televisions.add(television2);
        Book book1 = new Book(1,20,80);
        books.add(book1);
        Magazine magazine1=new Magazine(1,56,980);
        Magazine magazine2=new Magazine(2,6,1980);
        Magazine magazine3=new Magazine(3,42,540);
        magazines.add(magazine1);
        magazines.add(magazine2);
        magazines.add(magazine3);
        SportShoe sportShoe1=new SportShoe(1,25,98000);
        SportShoe sportShoe2=new SportShoe(2,25,98500);
        SportShoe sportShoe3=new SportShoe(3,25,98600);
        SportShoe sportShoe4=new SportShoe(4,25,98800);
        sportShoes.add(sportShoe1);
        sportShoes.add(sportShoe2);
        sportShoes.add(sportShoe3);
        sportShoes.add(sportShoe4);
        OxfordShoe oxfordShoe1=new OxfordShoe(1,30,10000);
        oxfordShoes.add(oxfordShoe1);
    }
}
