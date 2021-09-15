package com.Maktab;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        Customer customer = new Customer();
        store.makeStore();
        makeCustomer(customer);
        boolean success=true;
        while(success){
            success=menu(customer,store);
        }
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

    public static boolean menu(Customer customer, Store store) {
        System.out.println(store);
        return true;
    }
}
