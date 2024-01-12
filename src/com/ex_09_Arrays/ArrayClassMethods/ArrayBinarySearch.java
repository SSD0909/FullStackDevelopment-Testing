package com.ex_09_Arrays.ArrayClassMethods;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
	      Arrays.sort(list);
	      int element =50;
	      System.out.println(element+" found index at "+Arrays.binarySearch(list, element));
	}

}
