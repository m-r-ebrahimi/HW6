package com.Maktab;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Store store = new Store();
        Customer customer = new Customer();
        store.makeStore();
        makeCustomer(customer);
        int select;
        do {
            select = menu(customer, store);
        } while (select != 3);
    }

    public static void makeCustomer(Customer customer) {
        Address address = new Address();
        Scanner scanner = new Scanner(System.in);
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
        customer.setUsername(username);
        customer.setPassword(password);
        customer.setFirstName(firstname);
        customer.setLastName(lastname);
        customer.setPhoneNumber(phone);
        customer.setEmail(email);
        address.setState(state);
        address.setCity(city);
        address.setStreet(street);
        address.setPostalCode(code);
        customer.setAddress(address);
    }

    public static int menu(Customer customer, Store store) {

        System.out.println("1)add\n2)remove\n3)final");
        int select = scanner.nextInt();
        if (select == 1) {
            System.out.println(store);
            add(customer);
        } else if (select == 2) {
            remove(customer);
        } else if (select == 3) {
            buy(customer, store);
        } else {
            System.out.println("invalid input");
        }
        return select;
    }

    public static void add(Customer customer) {
        int[] item = new int[3];
        System.out.println("Enter what kind you want:\n1)radio\n2)television\n3)book\n4)magazine\n5)sport shoes\n6)oxford shoes");
        item[0] = scanner.nextInt();
        System.out.println("Enert id:");
        item[1] = scanner.nextInt();
        System.out.println("Enter count:");
        item[2] = scanner.nextInt();
        customer.addItem(item);
    }

    public static void remove(Customer customer) {
        System.out.println(customer.printCart());
        System.out.println("enter what you want delete:");
        customer.removeItem(scanner.nextInt() - 1);
    }

    public static void buy(Customer customer, Store store) {
        price(customer, store);
        updateStore(customer, store);
    }

    public static void price(Customer customer, Store store) {
        int price = 0;
        for (int i = 0; i < customer.getCart().length; i++) {
            int[] item = (int[]) customer.getCart()[i];
            if (item[0] == 1) {
                for (int j = 0; j < store.getRadios().length; j++) {
                    if (item[1] == store.getRadios()[j].getId()) {
                        price += store.getRadios()[j].getPrice() * item[2];
                    }
                }
            } else if (item[0] == 2) {
                for (int j = 0; j < store.getTelevisions().length; j++) {
                    if (item[1] == store.getTelevisions()[j].getId()) {
                        price += store.getTelevisions()[j].getPrice() * item[2];
                    }
                }
            } else if (item[0] == 3) {
                for (int j = 0; j < store.getBooks().length; j++) {
                    if (item[1] == store.getBooks()[j].getId()) {
                        price += store.getBooks()[j].getPrice() * item[2];
                    }
                }
            } else if (item[0] == 4) {
                for (int j = 0; j < store.getMagazines().length; j++) {
                    if (item[1] == store.getMagazines()[j].getId()) {
                        price += store.getMagazines()[j].getPrice() * item[2];
                    }
                }
            } else if (item[0] == 5) {
                for (int j = 0; j < store.getSportShoes().length; j++) {
                    if (item[1] == store.getSportShoes()[j].getId()) {
                        price += store.getSportShoes()[j].getPrice() * item[2];
                    }
                }
            } else {
                for (int j = 0; j < store.getOxfordShoes().length; j++) {
                    if (item[1] == store.getOxfordShoes()[j].getId()) {
                        price += store.getOxfordShoes()[j].getPrice() * item[2];
                    }
                }
            }
        }
        System.out.println(price);
    }

    public static void updateStore(Customer customer, Store store) {
        for (int i = 0; i < customer.getCart().length; i++) {
            int[] item = (int[]) customer.getCart()[i];
            if (item[0] == 1) {
                for (int j = 0; j < store.getRadios().length; j++) {
                    if (item[1] == store.getRadios()[j].getId()) {
                        store.getRadios()[j].setCount(store.getRadios()[j].getCount() - item[2]);
                    }
                }
            } else if (item[0] == 2) {
                for (int j = 0; j < store.getTelevisions().length; j++) {
                    if (item[1] == store.getTelevisions()[j].getId()) {
                        store.getTelevisions()[j].setCount(store.getTelevisions()[j].getCount() - item[2]);
                    }
                }
            } else if (item[0] == 3) {
                for (int j = 0; j < store.getBooks().length; j++) {
                    if (item[1] == store.getBooks()[j].getId()) {
                        store.getBooks()[j].setCount(store.getBooks()[j].getCount() - item[2]);
                    }
                }
            } else if (item[0] == 4) {
                for (int j = 0; j < store.getMagazines().length; j++) {
                    if (item[1] == store.getMagazines()[j].getId()) {
                        store.getMagazines()[j].setCount(store.getMagazines()[j].getCount() - item[2]);
                    }
                }
            } else if (item[0] == 5) {
                for (int j = 0; j < store.getSportShoes().length; j++) {
                    if (item[1] == store.getSportShoes()[j].getId()) {
                        store.getSportShoes()[j].setCount(store.getSportShoes()[j].getCount() - item[2]);
                    }
                }
            } else {
                for (int j = 0; j < store.getOxfordShoes().length; j++) {
                    if (item[1] == store.getOxfordShoes()[j].getId()) {
                        store.getOxfordShoes()[j].setCount(store.getOxfordShoes()[j].getCount() - item[2]);
                    }
                }
            }
        }
    }
}
