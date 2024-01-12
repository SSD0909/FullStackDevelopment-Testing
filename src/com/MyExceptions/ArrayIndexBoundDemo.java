package com.MyExceptions;

public class ArrayIndexBoundDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int [] a=new int[5];
		a[6]=9;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The array is out of Index");
		}
	}

}
