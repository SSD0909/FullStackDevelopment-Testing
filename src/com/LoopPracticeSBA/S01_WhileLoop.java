package com.LoopPracticeSBA;

import java.util.Scanner;

public class S01_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int mark;
Scanner sc= new Scanner(System.in);

System.out.println("Please Enter your mark to know the grade :");

mark=sc.nextInt();

while(mark<0 || mark>100) {
	
	System.out.println("Invalid Input");
	
	System.out.println("Please Enter your mark to know the grade :");
	mark=sc.nextInt();
		}

if(mark>=40) {
	System.out.println("Your grade is Good");
}
else {
	
	System.out.println("Please work hard next time");
	}
System.out.println("Good Luck, See you next time");
	}

}
