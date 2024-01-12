package com.A02_Assignments2_ATM_CashierChange;

import java.util.Scanner;

public class A01_ATM_Machine {


public static void main(String[] args) {
	
	//Variable declaration
	String userLogin="Stephy09";
	int userPassword=3490867;
	//integer value shouldn't start with zero, it will take it as a String input
	

	Scanner sc=new Scanner(System.in);

System.out.println("!!!WELCOME SSD BANK ATM!!!");
System.out.println("------------------------------------------------------");
System.out.println("PLEASE ENTER YOUR CREDENTIALS BELOW TO WITHDRAW MONEY");
System.out.println("------------------------------------------------------");
System.out.println("Enter your Login id : ");

if(userLogin=="Stephy09")	{
		userLogin=sc.next();
		
		System.out.println("!!!!Welcome Stephy. Your Login id is successful!!!!!");
		System.out.println("------------------------------------------------------");
		userLogin="Stephy09";
	}	
	
	

	System.out.println("Please enter your Password : ");	
	 userPassword=sc.nextInt();	
	 
if (userPassword==3490867){
	
System.out.println("!!!!Welcome Stephy Password was successful!!!!!");
System.out.println("------------------------------------------------------");
}	

else {
	System.out.println("###########################################");
	System.out.println("Incorrect Password. Please try again");
	System.out.println("###########################################");
	int attempts=1;
	
	while(attempts<4) {
		System.out.println("Please enter your Password : ");
		userPassword=sc.nextInt();
		System.out.println("------------------------------------------------------");
		System.out.println("Your Password Entered is: "+userPassword);
		System.out.println("------------------------------------------------------");
		 System.out.println("Number of Attempts " + attempts);
		 System.out.println("------------------------------------------------------");
		 attempts++;
		 if(userPassword==3490867) {
			// attempts=6;
			 System.out.println("!!!!Welcome Stephy Password was successful!!!!!");
			 System.out.println("------------------------------------------------------");
		 }
	}
	if(attempts==4) {
		System.out.println("------------------------------------------------------");
		System.out.println("You have reached the limit of attempts");
		System.out.println("------------------------------------------------------");
			}
	
}
	
	sc.close();
}
}