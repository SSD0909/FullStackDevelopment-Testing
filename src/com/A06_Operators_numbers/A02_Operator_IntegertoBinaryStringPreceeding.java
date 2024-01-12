package com.A06_Operators_numbers;

public class A02_Operator_IntegertoBinaryStringPreceeding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=150;
		System.out.println(Integer.toBinaryString(y));
		
		int x=y>>2;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x=y>>225;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x=y>>1555;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x=y>>32456;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		System.out.println("-------------------------------------------------");
	}

}
