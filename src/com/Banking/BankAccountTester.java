package com.Banking;

public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1=new BankAccount("98780","Sharon");
		BankAccount acc2=new BankAccount("98782","John");
		BankAccount acc3=new BankAccount("98781","Mina");
		BankAccount acc4=new BankAccount("98783","Sam");
		acc4.deposit(1000);
		acc4.withdraw(100);
		
		//printAccount number
		
		System.out.println("Account Number :"+acc4.getAccountNumber());
		System.out.println("Account Name :"+acc4.getAccountName());
		System.out.println("Account balance : "+acc4.getBalance());
		
	}

}
