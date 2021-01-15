package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount myAccount = new BankAccount(); // "42069", 0.00, "Russell", "rkoons@gmail.com", "(123) 456-7890");

		System.out.println(myAccount.getNumber());
		System.out.println(myAccount.getName());

//	    myAccount.setNumber("42069");
//	    myAccount.setBalance(0.00);
//	    myAccount.setName("Russell");
//	    myAccount.setEmail("rkoons@gmail.com");
//	    myAccount.setPhone("(123) 456-7890");

	    myAccount.withdraw(100.0);
	    myAccount.deposit(50.0);
        myAccount.withdraw(100.0);
        myAccount.deposit(51.0);
        myAccount.withdraw(100.0);

        BankAccount russellAccount = new BankAccount("Russell", "rkoons@gmail.com", "12345");

        System.out.println(russellAccount.getNumber() + " name " + russellAccount.getName());

        VipCustomer russell = new VipCustomer();
        System.out.println(russell.getName());

        VipCustomer natalie = new VipCustomer("Natalie", 1000.0);
        System.out.println(natalie.getName());

        VipCustomer alvaro = new VipCustomer("Alvaro", 1.0, "al@email.com");
        System.out.println(alvaro.getName());
    }
}
