package com.A06_Operators_numbers;

public class A07_Operator7_SumWithIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x =5;
		int y= 8;
		
	//	int sum =++x +y;
		//System.out.println("Sum of x increment and y is : "+sum);
		
		int sum = x++ + y;
		System.out.println("Sum of x increment and y is : "+sum);
		
		System.out.println("Sum of x increment and y is : "+x);
		
	}

}
