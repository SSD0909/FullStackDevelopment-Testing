package com.A02_Assignments2_ATM_CashierChange;

import java.util.Scanner;

public class A02_TestATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//Variable declaration
			String userLogin="Stephy09";
			int userPassword= 034567;
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
			 String userPassword1=Integer.toString(userPassword);
					 userPassword1=sc.next();	
			 
					 // use .equals method to compare two strings 
					 //object or integer we use == for comparison
					 //.equals is used to compare string to string
					 // if zero is the firstnumber for an integer variable then it will take it as a character string 
					 //so try to type cast it with integer.tostring(int) to convert the declared integer to a string value
					 //https://www.scaler.com/topics/difference-between-equals-method-in-java/
					 
		if (userPassword1.equals("034567")){
			
			
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
				userPassword1=sc.next();
				System.out.println("------------------------------------------------------");
				System.out.println("Your Password Entered is: "+userPassword);
				System.out.println("------------------------------------------------------");
				 System.out.println("Number of Attempts " + attempts);
				 System.out.println("------------------------------------------------------");
				 attempts++;
				 if(userPassword1.equals("034567")) {
					 attempts=6;
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