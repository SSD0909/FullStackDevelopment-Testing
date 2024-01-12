package com.MyExceptions;

public class Exceptions_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int[] num= {1,2,3,4};
System.out.println(num[4]);

		}
		catch(Exception e)
		{
			System.out.println("Something is wrong");
		}
		finally {//it is good to have finally after the catch to complete the block
			System.out.println("The try catch is complete");
		}
	}

}
