package com.Maktab.process;

import com.Maktab.person.Address;
import com.Maktab.person.Customer;
import com.Maktab.shop.product.*;
import com.Maktab.shop.store.Store;

import java.util.Arrays;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Process {
    Scanner scanner = new Scanner(System.in);

    public void run() {
        Store store = new Store();
        Customer customer = new Customer();
        store.makeStore();
        makeCustomer(customer);
        int select;
        do{
            select = menu(customer,store);
        }while(select!=4);
    }

    public void makeCustomer(Customer customer) {
        Address address;
        System.out.println("Enter user_name:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        System.out.println("Enter firstname:");
        String firstname = scanner.nextLine();
        System.out.println("Enter lastname:");
        String lastname = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        System.out.println("Enter state:");
        String state = scanner.nextLine();
        System.out.println("Enter city:");
        String city = scanner.nextLine();
        System.out.println("Enter street:");
        String street = scanner.nextLine();
        System.out.println("Enter postal code:");
        int code = scanner.nextInt();
        scanner.nextLine();
        customer.setUsername(username);
        customer.setPassword(password);
        customer.setFirstName(firstname);
        customer.setLastName(lastname);
        customer.setPhoneNumber(phone);
        customer.setEmail(email);
        address = new Address(state, city, street, code);
        customer.setAddress(address);
    }

    public int menu(Customer customer, Store store) {
        System.out.println("\n================\n1)add\n2)remove\n3)final\n4)EXIT\n================\n");
        int select = scanner.nextInt();
        scanner.nextLine();
        if (select == 1) {
            add(customer, store);
        } else if (select == 2) {
            remove(customer);
        } else if (select == 3) {
            buy(customer, store);
        } else {
            System.out.println("invalid input");
        }
        return select;
    }

    public void add(Customer customer, Store store) {
        int select;
        int id;
        int count;
        Product product;
        System.out.println("Enter what kind you want:\n1)radio\n2)television\n3)book\n4)magazine\n5)sport shoes\n6)oxford shoes");
        select = scanner.nextInt();
        scanner.nextLine();
        switch (select) {
            case 1 -> {
                System.out.println(Arrays.toString(store.getRadios()));
                product = new Radio();
            }
            case 2 -> {
                System.out.println(Arrays.toString(store.getTelevisions()));
                product = new Television();
            }
            case 3 -> {
                System.out.println(Arrays.toString(store.getBooks()));
                product = new Book();
            }
            case 4 -> {
                System.out.println(Arrays.toString(store.getMagazines()));
                product = new Magazine();
            }
            case 5 -> {
                System.out.println(Arrays.toString(store.getSportShoes()));
                product = new SportShoe();
            }
            case 6 -> {
                System.out.println(Arrays.toString(store.getOxfordShoes()));
                product = new OxfordShoe();
            }
            default -> {
                System.out.println("Invalid Input");
                product = new Product();
            }
        }
        System.out.println("\nEnter id:");
        id = scanner.nextInt();
        System.out.println("\nEnter count:");
        count = scanner.nextInt();
        scanner.nextLine();
        product.setId(id);
        product.setCount(count);
        customer.addItem(product);
    }

    public void remove(Customer customer) {
        System.out.println(customer.printCart());
        System.out.println("enter what you want delete:");
        customer.removeItem(scanner.nextInt() - 1);
    }


    public void buy(Customer customer, Store store) {
        int price = 0;
        for (Object product : customer.getCart()) {
            if (product instanceof Book) {
                price += findPrice(store, "Book", ((Book) product).getId(), ((Book) product).getCount());
                editStore(store, "Book", ((Book) product).getId(), ((Book) product).getCount());
            } else if (product instanceof Magazine) {
                price += findPrice(store, "Magazine", ((Magazine) product).getId(), ((Magazine) product).getCount());
                editStore(store, "Magazine", ((Magazine) product).getId(), ((Magazine) product).getCount());
            } else if (product instanceof OxfordShoe) {
                price += findPrice(store, "OxfordShoe", ((OxfordShoe) product).getId(), ((OxfordShoe) product).getCount());
                editStore(store, "OxfordShoe", ((OxfordShoe) product).getId(), ((OxfordShoe) product).getCount());
            } else if (product instanceof Radio) {
                price += findPrice(store, "Radio", ((Radio) product).getId(), ((Radio) product).getCount());
                editStore(store, "Radio", ((Radio) product).getId(), ((Radio) product).getCount());
            } else if (product instanceof SportShoe) {
                price += findPrice(store, "SportShoe", ((SportShoe) product).getId(), ((SportShoe) product).getCount());
                editStore(store, "SportShoe", ((SportShoe) product).getId(), ((SportShoe) product).getCount());
            } else {
                price += findPrice(store, "Television", ((Television) product).getId(), ((Television) product).getCount());
                editStore(store, "Television", ((Television) product).getId(), ((Television) product).getCount());
            }
        }
        System.out.println("your total price is " + price);
        System.out.println("\n\n=============\nFinal  Store\n=============\n"+store);
    }

    private int findPrice(Store store, String productType, int id, int count) {
        int price = 0;
        switch (productType) {
            case "Book":
                for (int i = 0; i < store.getBooks().length; i++) {
                    if (store.getBooks()[i].getId() == id)
                        price = store.getBooks()[i].getPrice() * count;
                }
                break;
            case "Magazine":
                for (int i = 0; i < store.getMagazines().length; i++) {
                    if (store.getMagazines()[i].getId() == id)
                        price = store.getMagazines()[i].getPrice() * count;
                }
                break;
            case "OxfordShoe":
                for (int i = 0; i < store.getOxfordShoes().length; i++) {
                    if (store.getOxfordShoes()[i].getId() == id)
                        price = store.getOxfordShoes()[i].getPrice() * count;
                }
                break;
            case "Radio":
                for (int i = 0; i < store.getRadios().length; i++) {
                    if (store.getRadios()[i].getId() == id)
                        price = store.getRadios()[i].getPrice() * count;
                }
                break;
            case "SportShoe":
                for (int i = 0; i < store.getSportShoes().length; i++) {
                    if (store.getSportShoes()[i].getId() == id)
                        price = store.getSportShoes()[i].getPrice() * count;
                }
                break;
            case "Television":
                for (int i = 0; i < store.getTelevisions().length; i++) {
                    if (store.getTelevisions()[i].getId() == id)
                        price = store.getTelevisions()[i].getPrice() * count;
                }
                break;
        }
        return price;
    }

    private void editStore(Store store, String productType, int id, int count) {
        switch (productType) {
            case "Book":
                for (int i = 0; i < store.getBooks().length; i++) {
                    if (store.getBooks()[i].getId() == id)
                        store.getBooks()[i].remove(count);
                }
                break;
            case "Magazine":
                for (int i = 0; i < store.getMagazines().length; i++) {
                    if (store.getMagazines()[i].getId() == id)
                        store.getMagazines()[i].remove(count);
                }
                break;
            case "OxfordShoe":
                for (int i = 0; i < store.getOxfordShoes().length; i++) {
                    if (store.getOxfordShoes()[i].getId() == id)
                        store.getOxfordShoes()[i].remove(count);
                }
                break;
            case "Radio":
                for (int i = 0; i < store.getRadios().length; i++) {
                    if (store.getRadios()[i].getId() == id)
                        store.getRadios()[i].remove(count);
                }
                break;
            case "SportShoe":
                for (int i = 0; i < store.getSportShoes().length; i++) {
                    if (store.getSportShoes()[i].getId() == id)
                        store.getSportShoes()[i].remove(count);
                }
                break;
            case "Television":
                for (int i = 0; i < store.getTelevisions().length; i++) {
                    if (store.getTelevisions()[i].getId() == id)
                        store.getTelevisions()[i].remove(count);
                }
                break;
        }
    }

}
