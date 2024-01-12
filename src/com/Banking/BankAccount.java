package com.Banking;
public class BankAccount {
	private String accountNumber;
	private String accountName;
	private double balance;
	
	BankAccount(String accountNumberIn, String accountNameIn){
		this.accountName=accountNameIn;
		this.accountNumber=accountNumberIn;
		this.balance=0;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amountIn) {
		balance=balance +amountIn;
	}
public boolean withdraw(double amountIn) {
	if(balance<amountIn) {
	System.out.println("No enough balance");
	return false;
	}
	else {
		balance=balance-amountIn;
		return true;
	}
}
}
