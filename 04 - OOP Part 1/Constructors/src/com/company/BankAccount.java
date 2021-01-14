package com.company;

public class BankAccount {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount() {
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String name, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of $" + amount + " made. New balance is $" + balance + ".");
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Only $" + balance + " available. Withdrawal failed.");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance is $" + balance + ".");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

