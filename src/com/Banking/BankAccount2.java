package com.Banking;

public class BankAccount2 {

	  private String accountNumber;
	    private String accountName;
	    private double balance;
	    private static double interestRate;
	//only read data into this method with a static method 
	    public BankAccount2(String numberIn, String nameIn)
	    {
	        accountNumber = numberIn;
	        accountName = nameIn;
	        balance = 0;
	    }

	    public String getAccountName()
	    {
	        return accountName;
	    }

	    public String getAccountNumber()
	    {
	        return accountNumber;
	    }

	    public double getBalance()
	    {
	        return balance;
	    }

	    public void deposit(double amountIn)
	    {
	    balance = balance + amountIn;
	    }

	            public boolean withdraw(double amountIn)
	            {
	                    if(amountIn > balance)
	                    {
	                            return false; 
	                    }
	                    else
	                    {
	                            balance = balance - amountIn;
	                            return true; 
	                    }
	            }
	//sets value into static variable
	    public static void setInterestRate(double rateIn)
	    {
	        interestRate = rateIn;
	    }
	//reads the value into the variable
	    public static double getInterestRate()
	    {
	        return interestRate;
	    }

	    public void addInterest()
	    {
	        balance = balance + (balance * interestRate)/100;
	    }
	}


