package com.Maktab.process;

import com.Maktab.person.Address;
import com.Maktab.person.Customer;
import com.Maktab.shop.product.*;
import com.Maktab.shop.store.Store;

import java.util.Arrays;
import java.util.Scanner;

public class Process {
    Scanner scanner = new Scanner(System.in);

    public void run() {

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

        System.out.println("\n================\n1)add\n2)remove\n3)final\n================\n");
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
        //price(customer, store);
        //updateStore(customer, store);
    }

}
