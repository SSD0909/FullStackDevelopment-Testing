package com.Banking;

public class BankAccountTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc5=new BankAccount("98784","Stephy");
		BankAccount acc6=new BankAccount("98785","Sara");
		
		acc5.deposit(1000);
		acc5.withdraw(100);
		
		//printAccount number
		
		System.out.println("Account Number :"+acc5.getAccountNumber());
		System.out.println("Account Name :"+acc5.getAccountName());
		System.out.println("Account balance : "+acc5.getBalance());
		acc6.deposit(4000);
		acc6.withdraw(1000);
		
		//printAccount number
		
		System.out.println("Account Number :"+acc6.getAccountNumber());
		System.out.println("Account Name :"+acc6.getAccountName());
		System.out.println("Account balance : "+acc6.getBalance());
		
		
	}

}
