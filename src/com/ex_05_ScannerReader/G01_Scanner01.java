package com.ex_05_ScannerReader;

import java.util.Scanner;

public class G01_Scanner01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000 :");
		int number = sc.nextInt();
		
		
		int lessThan10 = number %10;
		number/=10;
		
		int tens=  number %10;
		number/=10;
		
		int hundreds=  number %10;
		number/=10;
		
		int sum= hundreds+tens+lessThan10;
		
		System.out.println("The sum of digits is "+sum);
		
	
sc.close();
}
}
 