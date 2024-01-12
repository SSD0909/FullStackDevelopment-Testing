package com.ex_09_Arrays.ArrayClassMethods;

import java.util.Arrays;

public class ArrayCopy_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//deep copy is req instead of shallow copy
		
		int[]sourcearrays= {2,3,5,10};
		int[]targetarrays=new int[sourcearrays.length];
		for(int i=0; i<sourcearrays.length; i++) {
			
			targetarrays[i]=sourcearrays[i];
		}
		System.out.println(Arrays.toString(sourcearrays));
		System.out.println(Arrays.toString(targetarrays));
		
		// here the == operator is used to very the instance or the memory location of both objects
		if (targetarrays==sourcearrays) {
			System.out.println("Same Instance");
		}
		else {
			System.out.println("Different Instance");
		}
	}

}
