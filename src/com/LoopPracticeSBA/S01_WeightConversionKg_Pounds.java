package com.LoopPracticeSBA;

import java.util.Scanner;

public class S01_WeightConversionKg_Pounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter 1 for converting Kilograms to Pounds. \n Enter 2 for converting Pounds to Kilograms.");
		System.out.println("Please enter the type of conversion you need.");
		int response= sc.nextInt();
		
		switch(response) {
		case 1:{
			
			System.out.println("Enter the Kilograms that needs to be converted to Pounds: ");
			int k=sc.nextInt();
			
			while(k<1 ||k>199) {
				
				System.out.println("Entered weight is out of range. Do you want to try again?");
				System.out.println("Enter the Kilograms that needs to be converted to Pounds: ");
				k=sc.nextInt();
			}
				double kiloconvert= k*2.2;
				System.out.println("The weight in pounds is :"+kiloconvert);
			}
		
			
		case 2: {
			System.out.println("Enter the Pounds that needs to be converted to Kilograms: ");
			int p=sc.nextInt();
			
			while(p<20 ||p>515) {
				
				System.out.println("Entered weight is out of range. Do you want to try again?");
				char res=sc.next().charAt(0);
				
				do {
				System.out.println("Enter the Pounds that needs to be converted to Kilograms: ");
                
				p=sc.nextInt();
				}while(res=='y'|| res=='Y');
			}
				double poundconverter= p*9.09;
				System.out.println("The weight in pounds is :"+poundconverter);
			}
			
		}
		System.out.println("*****THANK YOU****");
		sc.close();
		}

	}


