package com.ex_09_Arrays.ArrayClassMethods;

public class Arraycopy_equalsymbol_copyingExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = {12,15, 17};
		 
        // define an array copyArray to copy contents of intArray
        int copyArray[] = new int[intArray.length];
 
        // copy contents of intArray to copyArray
     //   To overcome this problem, we employ a method of copying the array using a for loop. 
        //Here, each element of the original array is copied to the new array using a for loop.
        //So that elements will be copied instead of sharing the memory location
        for (int i=0; i<intArray.length; i++)
           copyArray[i] = intArray[i];
 
        // update element of copyArray
        // So when one array is modified, the changes do not reflect in another array.

        copyArray[0]++;
 
        //print both arrays
        System.out.println("intArray[] elements:");
        for (int i=0; i<intArray.length; i++)
            System.out.print(intArray[i] + " ");
 
        System.out.println("\n\ncopyArray[] elements:");
        for (int i=0; i<copyArray.length; i++)
            System.out.print(copyArray[i] + " ");

	}

}
