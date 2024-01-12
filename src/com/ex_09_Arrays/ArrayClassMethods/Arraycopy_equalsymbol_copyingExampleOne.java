package com.ex_09_Arrays.ArrayClassMethods;

public class Arraycopy_equalsymbol_copyingExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		int intArray[] = {12,15,17};
		 
        //print original intArray
        System.out.println("Contents of intArray[] before assignment:");
        for (int i=0; i<intArray.length; i++)
             System.out.print(intArray[i] + " ");
 
        // Create an array b[] of same size as a[]
        int copyArray[] = new int[intArray.length];
 
        /* intArray is assigned to copyArray; so references point to same location */
        //references of the array are assigned. Hence, this is not actual copying.

        copyArray = intArray; 	
 
        // change element of copyArray
        copyArray[1]++;
 //Now when the copyArray element is incremented, that change is reflected in the intArray too. 
        //print both arrays
        System.out.println("\nContents of intArray[]:");
        for (int i=0; i<intArray.length; i++){
              System.out.print(intArray[i] + " ");}
 
        System.out.println("\nContents of copyArray[]:");
        for (int i=0; i<copyArray.length; i++){
              System.out.print(copyArray[i] + " ");
              
        }
    }

}
