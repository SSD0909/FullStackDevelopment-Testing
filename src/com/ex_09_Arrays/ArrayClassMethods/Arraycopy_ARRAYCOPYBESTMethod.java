package com.ex_09_Arrays.ArrayClassMethods;

import java.util.Arrays;

public class Arraycopy_ARRAYCOPYBESTMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//iN SYSTEM CLASS THE ARRAYCOPY METHOD IS THE BEST METHOD TO COPY THE ELEMENTS FROM ONE ARRAY 
		
		int[]sourcearrays= {2,3,5,10};
		int[]targetarrays=new int[sourcearrays.length];
		
		System.out.println(Arrays.toString(sourcearrays));
		System.out.println(Arrays.toString(targetarrays));
		//arraycopy(sourceArray, srcPos, dest, destPos, length);
		//Here,
		//srcArray - source array you want to copy
		//srcPos - starting position (index) in the source array
		//dest - destination array where elements will be copied from the source
		//destPos - starting position (index) in the destination array
		//length - number of elements to copy

		System.arraycopy(sourcearrays, 0, targetarrays, 0,sourcearrays.length );
		System.out.println("After copy"+Arrays.toString(targetarrays));
		
for(int i=0; i<targetarrays.length; i++) {
			
	System.out.println(targetarrays[i]);
		}
		
	}

}
