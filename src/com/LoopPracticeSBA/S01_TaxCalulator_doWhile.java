package com.LoopPracticeSBA;

import java.util.Scanner;

public class S01_TaxCalulator_doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price,tax;
		char reply;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("***Product check***");
			System.out.println("Enter Initial price : ");
			price=sc.nextDouble();	
			
			
			System.out.println("Enter tax Rate : ");
			tax=sc.nextDouble();
			
			price= price*(1+tax/100);
			System.out.println("Cost after tax = "+price);
			
			System.out.println();
			System.out.println("Would you like to enter another product? Y/N");
			
			reply=sc.next().charAt(0);
			
			
		}while(reply=='y'|| reply=='Y');
		
		System.out.println("Thankyou");
	}

}
