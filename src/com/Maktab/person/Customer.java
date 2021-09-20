package com.Maktab.person;

import com.Maktab.shop.product.Product;

import java.util.Arrays;

public class Customer {
    static int i = 0;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Address address = new Address();
    private Product[] cart = new Product[0];

    public Customer() {
    }

    public Customer(String username, String password, String firstName, String lastName, String phoneNumber, String email, Address address) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Product[] getCart() {
        return cart;
    }

    public void addItem(Product item) {
        resize();
        cart[i++] = item;
    }

    public void removeItem(int index) {
        if (cart.length - 1 - index >= 0)
            if (cart.length - index >= 0)
                if (cart.length - 1 - index >= 0)
                    System.arraycopy(cart, index + 1, cart, index, cart.length - 1 - index);
                smaller();
    }

    public void resize() {
        cart = Arrays.copyOf(cart, cart.length + 1);
    }

    public void smaller() {
        cart = Arrays.copyOf(cart, cart.length - 1);
        i--;
    }

    public String printCart() {
        return Arrays.deepToString(cart);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", cart=" + Arrays.deepToString(cart) +
                '}';
    }
}
