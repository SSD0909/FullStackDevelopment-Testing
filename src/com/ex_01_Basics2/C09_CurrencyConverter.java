package com.ex_01_Basics2;

import java.util.Scanner;

public class C09_CurrencyConverter {
	
// declaring and initializing the conversion rates for different currencies
	int rupee =63;
	int dirham= 3;
	int _yen= 107;
	int real= 3;
	int chilean_peso=595;
	int mexican_peso=18;
	int $australian=2;
	int Rupee=63;
	int dollar;
	
//creating a method named printCurrencies() to print all the conversion rates for 1USD
void  printCurrencies() {
		
		System.out.println("1USD is equal to : Rs."+rupee);
		System.out.println("1USD is equal to : AED."+dirham);
		System.out.println("1USD is equal to : JPY."+_yen);
		System.out.println("1USD is equal to : R$."+real);
		System.out.println("1USD is equal to : Cpeso."+chilean_peso);
		System.out.println("1USD is equal to : MexPeso."+mexican_peso);
		System.out.println("1USD is equal to : AUD$."+$australian);
		System.out.println("1USD is equal to : INR."+Rupee);
	
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the currency you need to convert : ");

		System.out.println("Enter 1 for rupee \nEnter 2 for Dhirham \nEnter 3 for Yen \n"
				+ "Enter 4 for Brazilian Real \nEnter 5 for Chilean Peso \nEnter 6 for Mexican Peso"
				+"Enter 7 for Australian Dollar \nEnter 8 for Rupee");

		int currencyInput=sc.nextInt();

		switch(currencyInput) {
		case 1:{
			
			System.out.println("1USD is equal to : Rs."+rupee);
			break;
		}

		case 2:{
			
			System.out.println("1USD is equal to : AED."+dirham);
			break;
		}
		case 3:{
			
			System.out.println("1USD is equal to : JPY."+_yen);
			break;
		}
		case 4:{
			System.out.println("1USD is equal to : R$."+real);
			break;
		}
		case 5:{
			
			System.out.println("1USD is equal to : Cpeso."+chilean_peso);
			break;
		}
		case 6:{
			System.out.println("1USD is equal to : MexPeso."+mexican_peso);
			break;
		}
		case 7:{
			System.out.println("1USD is equal to : AUD$."+$australian);

			break;

		}
		}
		sc.close();
	}
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
System.out.println("!!!!!Welcome to the Currency convertor!!!!");
System.out.println("--------------------------------------------");
C09_CurrencyConverter cc= new C09_CurrencyConverter();
cc.printCurrencies();
System.out.println("--------------------------------------------");
	}
}
	

