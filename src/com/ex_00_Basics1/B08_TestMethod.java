package com.ex_00_Basics1;


public class B08_TestMethod {
	public static int add(int a , int b) {
		return a+b;
	}
	public static int sub(int a , int b) {
		return a-b;
	}
	public static int multiply(int a , int b) {
		return a*b;
	}
	public static int divide(int a , int b) {
		return a/b;
	}
	public static int modulus(int a , int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=add(4, 2);
		System.out.println(result);
		result=sub(10, 5);
		System.out.println(result);
		result=multiply(50, 2);
		System.out.println(result);
		result=divide(800, 20);
		System.out.println(result);
		result=modulus(20, 5);
		System.out.println(result);

	}

}
