package com.ex_09_Arrays.ArrayClassMethods;

import java.util.Arrays;

public class Arrayfill_updatefill_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]values= new int[10];
Arrays.fill(values, 6);//set all values to 6
for(int i : values) {
	
	System.out.println(i);
}

//update/insert an entore array to an element and changed it to string
long[]values1= new long[10];
Arrays.fill(values1, 600);//all values sets to 600
System.out.println(Arrays.toString(values1));



//update an array with fill method for a range of elements
int arr[]= {12,63,89,99,75,55};
Arrays.fill(arr,2,5,69);//fill the values in arr array from 2 to 4 with 69
System.out.println(arr);
	}

}
