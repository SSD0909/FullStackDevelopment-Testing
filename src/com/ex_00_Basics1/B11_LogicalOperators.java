package com.ex_00_Basics1;


public class B11_LogicalOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		boolean b=true;
		System.out.println(b);
		System.out.println(1>2&& b);
		System.out.println(2>1&& b);
		System.out.println("------------------------------------");
		
		boolean b1=true;
		System.out.println(b1);
		System.out.println(1>2|| b1);
		
		System.out.println(2>1|| b1);
		
	}
}
