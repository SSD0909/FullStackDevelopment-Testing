package com.A11_ArrayPracticeAssignment;

public class A11_Arrayindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr=new int[] {1,3,5,6,4};
		
		System.out.println("The value of first index is "+arr[0]);
		
		System.out.println("The value of first index is "+(arr[(arr.length)-1]));
		
		//index out of bound exception 
		System.out.println("The value of first index is "+(arr[arr.length]));

	}

}
