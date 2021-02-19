package com.company;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Russell", 4.20);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
    }
}
