package com.A11_ArrayPracticeAssignment;

import java.util.Arrays;

public class A11_ArratoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []str= new String[] {"red" ,"green", "blue" ,"yellow"};
		
		System.out.println("The length of the array is  :"+str.length);
		
		String[]targetstr=str.clone();
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(targetstr));
		
		if(str.equals(targetstr)) {
			
			System.out.println("Copied data is correct");
		}
		else {
			
			System.out.println("Copied data is  not correct");
		}
	}

}
