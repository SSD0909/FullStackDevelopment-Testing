package com.ex_11_AdvancedJava.Advanced;

import java.util.Scanner;

public class S01_UserInputArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		int[] someArray;
		System.out.println("Enter the elements to store");
		int size= keyboard.nextInt();
		
		someArray= new int[size];
	}

}
