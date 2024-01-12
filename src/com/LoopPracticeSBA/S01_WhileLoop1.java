package com.LoopPracticeSBA;

import java.util.Scanner;

public class S01_WhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//n/2
//n%2=

		Scanner sc= new Scanner(System.in);
		int count=0;
		/*int count1=0;
		//System.out.println("Enter the number");
		//int x= n.nextInt();
		for(int i=1;i<=10;i++) {
			
			if(i%2==0) {
				System.out.println("The number is even :"+i);
				count++;
			}
			else if(i%2!=0)
			{
				System.out.println("The number is odd :"+i);
				count1++;
						
			}
		}
		System.out.println("Total Count of the even numbers is :"+count);
		System.out.println("Total Count of the odd numbers is :"+count1);*/
		System.out.println("Please Enter the number : ");
		int oddcounter=0;
		int evencounter=0;
		int n=sc.nextInt();
		while(n%2==0) {
			
			System.out.print("The entered number is "+n+" even");
			evencounter++;
			System.out.println("Even counter is"+evencounter);
			System.out.print("If you want to try another number ,please enter the number :");
			 n=sc.nextInt();
		}
		
		oddcounter++;
		System.out.print("The entered number is "+n+" odd");	
		System.out.println("Odd counter is "+oddcounter);
		}
	

}
