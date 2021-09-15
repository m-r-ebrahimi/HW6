package com.Maktab;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Store store = new Store();
        Customer customer = new Customer();
        store.makeStore();
        makeCustomer(customer);
        boolean success = true;
        while (success) {
            menu(customer, store);
        }
        System.out.println(customer);
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

    public static void menu(Customer customer, Store store) {

        System.out.println("1)add\n2)remove\n3)final");
        int select = scanner.nextInt();
        if (select == 1) {
            System.out.println(store);
            add(customer);
        }else if (select ==2){

        }else if (select == 3) {

        }else{

        }

        }
        public static void add(Customer customer){
            int[] item = new int[3];
            System.out.println("Enter what kind you want:\n1)radio\n2)television\n3)book\n4)magazine\n5)sport shoes\n6)oxford shoes");
            item[0] = scanner.nextInt();
            System.out.println("Enert id:");
            item[1] = scanner.nextInt();
            System.out.println("Enter count:");
            item[2] = scanner.nextInt();
            customer.addItem(item);
        }
    }
