package com.A06_Operators_numbers;

public class A01_Operator_IntegertoBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------------------");
		int x =2;
		System.out.println(Integer.toBinaryString(x));
		
		x=x<<1;
		//when shift 2 by 1 to the left the new value is 4
		System.out.println(x);
//The binary value is 100
		System.out.println(Integer.toBinaryString(x));
		x=x<<9;
		System.out.println(x);
		
		x=x<<17;
		System.out.println(x);
		
		x=x<<88;
		System.out.println(x);
		
		System.out.println("-------------------------------------------------");
		
		
		
		
		
	}

}
