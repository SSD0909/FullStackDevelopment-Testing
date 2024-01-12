package com.MyExceptions;

public class ExceptionsThrow {
	
	static void checkAge(int age) 
	{
			if(age<18) {
				//System.out.println("Access not granted You are not old enough");
				
				throw new ArithmeticException("Access not granted You are not old enough");
			}
			else {
			System.out.println("Access granted-You are old enough");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
checkAge(20);

	}

}
