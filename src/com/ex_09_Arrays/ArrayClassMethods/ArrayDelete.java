package com.ex_09_Arrays.ArrayClassMethods;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * To maintain the efficiency of random access (being able to access the array through an index extremely fast)
		 *  the elements must be stored in contiguous spaces of memory. 
		 *  You can’t just delete the element and leave that empty space 

		 * 
		 * 
		 * 
		 * 
		 * You should move the elements that come after the element that you want to delete one index to the left.
		 */
		 int[] array = {10,25,36,58,96,74,110};
		   
		    int removeindex = 1;
		    for(int i = removeindex; i<array.length - 1; i++)
		       {
		          array[i] = array[i + 1];
		       }

		    System.out.println("25 is deleted from index 1 " + Arrays.toString(array));

	}

}
