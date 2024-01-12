package com.A11_ArrayPracticeAssignment;

public class A11_ArrayElementSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr= new String[] {"Apple","Orange","Pear","Banana","Fig"};
		//swap the first and middle element
		
		String temp=arr[1];
		
		arr[1]=arr[2];
		arr[2]=temp;
		System.out.println("The swapped array is :");
		
		for(String str: arr) {
			
			System.out.print(str+" ");
		}
	

	}
}
