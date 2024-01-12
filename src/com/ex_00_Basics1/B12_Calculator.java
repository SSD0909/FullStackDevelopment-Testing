package com.ex_00_Basics1;


public class B12_Calculator {
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
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B12_Calculator cal=new B12_Calculator();
		System.out.println("Addition of two numbers is : "+cal.add(40,20));
		System.out.println("Subtraction of two numbers is : "+cal.sub(40,20));
		System.out.println("Multiplication of two numbers is : "+cal.multiply(40,20));
		System.out.println("Dividion of two numbers is : "+cal.divide(40,20));
		System.out.println("Modulus of two numbers is : "+cal.modulus(40,20));
	}

}
