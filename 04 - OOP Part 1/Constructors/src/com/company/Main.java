package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount myAccount = new BankAccount();

	    myAccount.withdraw(100.0);
	    myAccount.deposit(50.0);
        myAccount.withdraw(100.0);
        myAccount.deposit(51.0);
        myAccount.withdraw(100.0);

    }
}
