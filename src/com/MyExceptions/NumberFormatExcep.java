package com.MyExceptions;

public class NumberFormatExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
int num= Integer.parseInt("hello");
System.out.println(num);

		}
		
		catch(NumberFormatException e) {
			
			System.out.println("You have to enter a number");
		}

	}

}
