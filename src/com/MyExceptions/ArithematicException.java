package com.MyExceptions;

public class ArithematicException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
int a=30, b=0; 
int c = a/b;
System.out.println("Result ="+ c);
		}
		catch(ArithmeticException e) {

			System.out.println("Cant divide a number by 0");
		
		}
		
	}

}
