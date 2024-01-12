package com.A10_StringMethods;

import java.util.Scanner;

public class A10_ReadingStringfromConsole1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	       System.out.print("Enter a character: ");
	       String s = input.nextLine();
	       char ch = s.charAt(0);
	       System.out.println("The character entered is " + ch);

	}

}
