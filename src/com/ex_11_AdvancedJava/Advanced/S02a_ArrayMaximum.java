package com.ex_11_AdvancedJava.Advanced;

import java.util.Scanner;

public class S02a_ArrayMaximum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] someArray = {9,100,5,78,2,21};
		System.out.println("Max number is :"+max(someArray));
		System.out.println("Sum number is :"+sum(someArray));
		System.out.println("Contains the number or not :"+contains(someArray,6));
		System.out.println("Sum number is :"+sum(someArray));
		System.out.println("Seach the number index is in  :"+search(someArray,21));
		
	}
	
		 static int search(int[] array, int value) {
		// TODO Auto-generated method stub
			 for (int i = 1; i < array.length; i++)
			    {
			        if(array[i] == value)
			        {
			           return i; // reset result to new maximum
			        }
			    }
			    return -999;
	}

		static boolean contains(int[] arrayInput1, int value) {
		// TODO Auto-generated method stub
			for(int x:arrayInput1) {
		        if(x == value)
		        {
		            return true; // reset result to new maximum
		        }
		        
		    }
			return false;
	}

		private static int sum(int[] arrayInput) {
		// TODO Auto-generated method stub
			
			int total=0;
			for(int x:arrayInput) {
				total=total+x;
			}
		return total;
	}

		// TODO Auto-generated method stub

		static int max (int[] arrayIn)
		{
		    int result = arrayIn[0]; // set result to the first value in the array
		// this loops runs from the 2nd item to the last item in the array
		    for (int i = 1; i < arrayIn.length; i++)
		    {
		        if(arrayIn[i] > result)
		        {
		            result = arrayIn[i]; // reset result to new maximum
		        }
		    }
		    return result;
		}
}