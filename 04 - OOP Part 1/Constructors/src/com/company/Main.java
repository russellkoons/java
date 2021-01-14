package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount myAccount = new BankAccount();

	    myAccount.setNumber("42069");
	    myAccount.setBalance(0.00);
	    myAccount.setName("Russell");
	    myAccount.setEmail("rkoons@gmail.com");
	    myAccount.setPhone("(123) 456-7890");

	    myAccount.withdraw(100.0);
	    myAccount.deposit(50.0);
        myAccount.withdraw(100.0);
        myAccount.deposit(51.0);
        myAccount.withdraw(100.0);

    }
}
