package com.ex_09_Arrays.ArrayClassMethods;

public class ArrayReverse {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]intArray= {10,20,30,85,25,22};
		System.out.println("Original array :");
		
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]+"");
			
		}
		System.out.println();
		//print arary starting from last element
		
		for(int i=intArray.length-1;i>=0;i--)
		{
			System.out.println(intArray[i]+" ");
			
		}
		}

}
