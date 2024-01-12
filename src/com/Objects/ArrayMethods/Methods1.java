package com.Objects.ArrayMethods;

public class Methods1 {
	public static int x;
	public static void change(int[]A,int index, int value) {
		
		A[index]=value;
	}
	
	public static void normalchange(int value) {
		
		x=value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]A= {2,78,34,67,9,10};
		
		change(A,3,35);
		for(int x : A) {
			
			System.out.println(x);
		}
		
	 x=10;
		normalchange(20);
		
		System.out.println(x);
		
	}

}
