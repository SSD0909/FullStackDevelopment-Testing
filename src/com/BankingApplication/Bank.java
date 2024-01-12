package com.BankingApplication;

import java.util.ArrayList;

public class Bank
{
ArrayList<BankAccount> list = new ArrayList<>();
// helper method to find the index of a specified account
private int search(String accountNumberIn)
{
	for(int i = 0; i <= list.size() - 1; i++)
	{
// find the account at index i
		BankAccount tempAccount = list.get(i);
// get account number
		String tempNumber =tempAccount.getAccountNumber();
//if this is the account we are looking for
		if(tempNumber.equals(accountNumberIn))
		{
//return the index
			return i;
		}
	}
	return -999;
}
//return the total number of items
//return the size of the array
public int getTotal()
{
return list.size();
}
//return an account with a particular accountnumber---returns an object of type BankAccount
public BankAccount getItem(String accountNumberIn)
{
	
	//first search the accountnumber , returns an index pass it check if exists or not
	//we can get object out of that
int index = search(accountNumberIn);
if(index != -999) // check that account exists
{//if existis get the index of the number and its a reference type bankaccount
return list.get(index);
}
else
{
return null; // no such account
}
}
// add an item to the list
public boolean addAccount(String accountNumberIn,
String nameIn)
{
if(search(accountNumberIn) == -999) 
// check that account does not already exist
{
list.add(new BankAccount(accountNumberIn,
nameIn)); // add new account
return true;
}
return false;
}
//deposit money in a specified account
//get the account first --inturn search and brings it
public boolean depositMoney(String
accountNumberIn, double amountIn)
{
BankAccount acc = getItem(accountNumberIn);
if(acc != null)
{
acc.deposit(amountIn);
return true; // indicate success
}
else
{
return false; // indicate failure
}
}
//withdraw money from a specified account
public boolean withdrawMoney(String
accountNumberIn, double amountIn)
{
BankAccount acc = getItem(accountNumberIn);
if(acc != null && acc.getBalance() >= amountIn)
{
acc.withdraw(amountIn);//method chaining
return true; // indicate success
}
else
{
return false; // indicate failure
}
}
//remove an account
public boolean removeAccount(String
accountNumberIn)
{
int index = search(accountNumberIn); // findindex of account
if(index != -999) // if account exists account
{
list.remove(index);
return true; // remove was successful
}
else
{
return false; // remove was unsuccessful
}
}
}

