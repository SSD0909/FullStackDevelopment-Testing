package com.A09_WhileLoop;

import java.util.Scanner;

public class A09_GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter the first number : ");
int n1 =sc.nextInt();
System.out.println("Please Enter the second number : ");
int n2 =sc.nextInt();



int gcd=1;

int k=2;

while(k <=n1 && k<=n2) {
	
	if(n1%k==0 && n2%k==0) {
		
		gcd=k;
		
		
	}
	k++;
	}
System.out.println("The greatest common divisor of the two numbers is :"+gcd);
}
}