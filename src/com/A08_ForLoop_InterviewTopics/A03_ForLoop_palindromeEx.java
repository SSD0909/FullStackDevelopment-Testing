package com.A08_ForLoop_InterviewTopics;

import java.util.Scanner;

public class A03_ForLoop_palindromeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = ""; // Objects of String class
	       Scanner in = new Scanner(System.in);
	System.out.println("Enter a string/number to check if it is a palindrome");
	       original = in.nextLine();
	       int length = original.length();
	       for ( int i = length - 1; i >= 0; i-- )
	           reverse = reverse + original.charAt(i);
	       //charAt will verify the character
	       if (original.equals(reverse)) {
	         System.out.println("Entered string/number is a palindrome.");
	       }else
	       {
	         System.out.println("Entered string/number isn't a palindrome.");
	       }
in.close();
	}

}
