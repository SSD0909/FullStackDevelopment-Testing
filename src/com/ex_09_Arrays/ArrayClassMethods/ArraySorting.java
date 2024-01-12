package com.ex_09_Arrays.ArrayClassMethods;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//quick sort gives  best performance
		double[] numbers= {1,3.23,4,2,5,4.3,8,90.63,56,73,35,65};
		
						
				
				Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
	}

}
