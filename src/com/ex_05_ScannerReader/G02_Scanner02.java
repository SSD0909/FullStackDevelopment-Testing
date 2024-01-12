package com.ex_05_ScannerReader;

import java.util.Scanner;

public class G02_Scanner02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number in minutes :");
		int minutes = sc.nextInt();
		
		int years = minutes/525600;
		int days = (minutes%525600)/1440;
		
		System.out.println(minutes +" minutes is approximately " +years +" years and " + days +"days");
		sc.close();
		
	}

}
