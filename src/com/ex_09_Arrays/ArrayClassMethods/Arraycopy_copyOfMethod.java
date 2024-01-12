package com.ex_09_Arrays.ArrayClassMethods;

import java.util.Arrays;

public class Arraycopy_copyOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//The Java class Arrays provides a method called Arrays.copyOf() that returns a copy of an array passed as a parameter to this method,
		
		   //followed by specifying its size.
		/*Syntax:
			Arrays.copyOf(int[] templateArray, int length);

			💡 Note that the second parameter “length” is the size of the copy array you want to create. 
			So here we can have 3 cases.
			The lengths of both the template and copy arrays are the same.
			The length of the copy array is greater than the length of the template array.
			The length of the copy array is less than the length of the template array.*/
		
		
		 // Initialize your templateArray which you want a copy of
	       int[] templateArray = new int[] {1, 2, 3, 4, 5, 6};
	       System.out.println("Template Array: " + Arrays.toString(templateArray));

	       // Create a "copy" of template array using
	       // Arrays.copyOf(int[] array, int arrayLength) method

	       // CASE 1: Sizes of both template & copy arrays are same
	       int[] copyArray1 = Arrays.copyOf(templateArray, templateArray.length);
	       System.out.println("Copy Array 1: " + Arrays.toString(copyArray1));

	       // CASE 2: Size of copy array > Size of template array
	       // extra space in copy array is filled with zeros
	       int[] copyArray2 = Arrays.copyOf(templateArray, 10);
	       System.out.println("Copy Array 2: " + Arrays.toString(copyArray2));

	       // CASE 3: Size of copy array < Size of template array
	       // copy array is only filled with only elements in overlapping size
	       int[] copyArray3 = Arrays.copyOf(templateArray, 3);
	       System.out.println("Copy Array 3: " + Arrays.toString(copyArray3));

	}

}
