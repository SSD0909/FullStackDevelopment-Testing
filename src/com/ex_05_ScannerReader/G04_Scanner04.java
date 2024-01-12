package com.ex_05_ScannerReader;

import java.util.Scanner;

public class G04_Scanner04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter v0, v1 and t: ");
		double v0=sc.nextDouble();
		double v1=sc.nextDouble();
		double t =sc.nextDouble();
		
		
		double a =(v1- v0)/t;
		
		System.out.println("The average acceleration is "+a);
		
		sc.close();
		
	}

}
