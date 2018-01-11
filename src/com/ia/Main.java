package com.ia;

public class Main {

    public static void main(String[] args) {

	BankAccount bobsAccount = new BankAccount();//("12345", 0.00,"Bob Brown", "bob_qms@yahoo.com","(021)2523338");
//	bobsAccount.setNumber("12345");
//	bobsAccount.setBalance(0.00);
//	bobsAccount.setName("Bob Brown");
//	bobsAccount.setEmail("bob_qms@yahoo.com");
//	bobsAccount.setPhoneNumber("(021)2523338");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

	bobsAccount.withdrawal(1000000.0);

	bobsAccount.deposit (50.0);
	bobsAccount.withdrawal(100.0);

	bobsAccount.deposit(51.0);
	bobsAccount.withdrawal(100.0);
    }
}
