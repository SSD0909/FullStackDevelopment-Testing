package com.ex_01_Basics2;

import java.util.Scanner;

public class C06_ScannerInput_If {

	public static void main(String[] args) {
		///Creating the scanner object
		Scanner in =new Scanner(System.in);

		System.out.println("Please Enter Your Score : ");
		
		int score=in.nextInt();

		if(score==5) {//if(condition1) is true this block will execute
			System.out.println("Excellent");
		}
			else if(score==4) {//else if (condition2) is true this block will execute
				
				System.out.println("Good");
			}
			else {
				System.out.println("Needs improvement");//if no conditions are true then this block will execute
			}
			
in.close();
	}

}
