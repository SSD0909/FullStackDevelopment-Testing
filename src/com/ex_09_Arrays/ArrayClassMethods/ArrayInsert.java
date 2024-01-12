package com.ex_09_Arrays.ArrayClassMethods;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*We occasionally need to delete or insert an element from or into an array. However, because arrays are  fixed-sized, we cannot actually “delete” or “insert” But we can shift elements:
To “insert” an element, we create a gap by shifting all elements above the index rightward.
To “delete” an element, we shift all elements above the index leftward.*/
		
		
		int x = 28;
	       int myArray[]    = {0, 1, 2, 45, 7, 5, 17};
	       // create a new array of  bigger size (n+1)

	       int newArray[] = new int[myArray.length + 1];
	    // insert the elements from the old array into the new one
	       for (int i = 0; i < myArray.length; i++) {
	    	   newArray[i] = myArray[i];
	           newArray[myArray.length] = x;
	       }     
	    System.out.println("28 is inserted --> "+ Arrays.toString(newArray));

	}

}
