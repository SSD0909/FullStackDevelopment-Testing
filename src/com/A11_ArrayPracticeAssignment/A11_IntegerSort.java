package com.A11_ArrayPracticeAssignment;

import java.util.Arrays;

public class A11_IntegerSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] x=new int[]	{4, 2, 9, 13, 1,0};
	
	Arrays.sort(x);
	Arrays.toString(x);
	
	for(int f:x) {
		
		System.out.println(f);
	}
	
	System.out.println("Smallest Element"+x[0]);
	System.out.println("Largest Element"+x[x.length-1]);
	}

}
