package com.ex_09_Arrays.ArrayClassMethods;

import java.util.Arrays;

public class ArrayCopy_ObjectCloneMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Cloning involves creating a new array of the same size and type, the entire source array's elements are copied into the target array.
		//The clone() method is defined in the Object class.
		//Remember: an array in Java is an Object because the direct Superclass of an array is an Object class.
		//So we can use an Object class’s method /attributes with an array.
		int[]sourcearrays= {2,3,5,10};
		int[]targetarrays=sourcearrays.clone();
		
		sourcearrays[3]=800;
		
		System.out.println(Arrays.toString(sourcearrays));
		System.out.println(Arrays.toString(targetarrays));
		
	}

}
