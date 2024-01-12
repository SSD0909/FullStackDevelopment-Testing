package com.A07_ControlFlow;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		double taxRate;
		double taxableIncome;
		System.out.println("Enter 1. for Single ,Enter 2 for Married Filing Jointly ,Enter 3 for Married Filing Separately"
				+ "Enter 4 for  Head of Household");
		int status=in.nextInt();
		switch(status) {
		case 1 :{
			System.out.println("Enter Income");
			taxableIncome=in.nextInt();
			if(taxableIncome<=8350) {
				taxRate=0.10;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
									}
			else if (taxableIncome>8351 && taxableIncome<=33950) {
				taxRate=0.15;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
							}
			else if (taxableIncome>33951 && taxableIncome<=82250) {
				taxRate=0.25;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>82251 && taxableIncome<=171550) {
				taxRate=0.28;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>171551 && taxableIncome<=372950) {
				taxRate=0.33;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>=372951) {
				taxRate=0.35;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			break;
		}
		case 2 :{
			System.out.println("Enter Income");
			taxableIncome=in.nextInt();
			if(taxableIncome<=16700) {
				
				taxRate=0.10;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
					}
			else if (taxableIncome>16701 && taxableIncome<=67900) {
				taxRate=0.15;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>67901 && taxableIncome<=137050) {
				taxRate=0.25;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>137051 && taxableIncome<=208850) {
				taxRate=0.28;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>208851 && taxableIncome<=372950) {
				taxRate=0.33;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>=372951) {
				taxRate=0.35;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			break;
		}
		case 3 :{
			System.out.println("Enter Income");
			
			taxableIncome=in.nextInt();
			if(taxableIncome<=8350) {
				
				taxRate=0.10;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);	}
			else if (taxableIncome>8351 && taxableIncome<=33950) {
				taxRate=0.15;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>33951 && taxableIncome<=68525) {
				taxRate=0.25;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>68526 && taxableIncome<=104425) {
				taxRate=0.28;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>104426 && taxableIncome<=186475) {
				taxRate=0.33;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>=186476) {
				taxRate=0.35;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			break;
		}
		case 4 :{
			System.out.println("Enter Income");
			
			taxableIncome=in.nextInt();
			if(taxableIncome<=11950) {
				
				taxRate=0.10;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
					}
			else if (taxableIncome>11951 && taxableIncome<=45500) {
				taxRate=0.15;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>45501 && taxableIncome<=117450) {
				taxRate=0.25;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>117451 && taxableIncome<=190200) {
				taxRate=0.28;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>190201 && taxableIncome<=372950) {
				taxRate=0.33;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			else if (taxableIncome>=372951) {
				taxRate=0.35;
				double taxamount=taxableIncome*taxRate;
				double incomeTax=taxableIncome-taxamount;
				System.out.println(incomeTax);
			}
			break;
		}
	}

	}
}
