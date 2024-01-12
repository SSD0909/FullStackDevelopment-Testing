package com.A09_WhileLoop;

import java.util.Scanner;

public class A09_GCDForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the first number : ");
		int n1 =sc.nextInt();
		System.out.println("Please Enter the second number : ");
		int n2 =sc.nextInt();
int gcd=1;
int min=0;
if(n1<n2) {

	min=n1;
}
else {
	
	min=n2;
}
						
			for(int i=min;i>=1;i--) {
				
				if(n2%i==0 && n1%i==0) {
					
					gcd=i;
					break;	
					
				}
							
			}
			System.out.println(gcd);	
		}
		
	
		
	}


