package com.BankingApplication;
//7a...next... returns the maximum value in an array
//7b......next  call sum method

import java.util.Scanner;

// a menu driven program to test a selection of useful array methods 

public class s04_SomeUsefulArrayMethods
{
	public static void main (String[] args)
	{
		// 1 Array methods: s01a_ask_user_to_determine_size_of_array
		char choice;
		Scanner keyboard = new Scanner(System.in);

		// 2 declare an integer array
		int[] someArray;

		// 3 Enter a value for the size ....size the array
		System.out.print("How many elements would you like to store  in your array?: ");
		int size = keyboard.nextInt();
		someArray = new int [size];

		//4 the menu

		//5b call fillArray method and pass it array reference
		fillArray(someArray);

		//6b call sum method
		int total = sum(someArray);
		System.out.println("6b Sum of array values is = " + total);

      //7b......next  call sum method

		int max = max(someArray);
		System.out.println("7b Maximum array value is = " + max);



		System.out.println("Array is full Goodbye");
	}


	//5a M1 method to fills someArray with values
	//check for tips s01Temperature
	static void fillArray(int[] arrayIn)
	{
		Scanner keyboard = new Scanner (System.in);
		for (int i = 0; i < arrayIn.length; i++)
		{
			System.out.print("Now enter your values into the array until array is full ");
			arrayIn[i] = keyboard.nextInt();
		}
	}


	//6a
	// returns the total of all the values held within an array
	static int sum (int[] arrayIn)
	{
		int total = 0;
		for (int currentElement : arrayIn)
		{
			total = total + currentElement;
		}
		return total;
	}


	//7a...next... returns the maximum value in an array
	static int max (int[] arrayIn)
	{
		int result = arrayIn[0]; // set result to the first value in the array
		// this loops runs from the 2nd item to the last item in the array
		for (int i=1; i < arrayIn.length; i++)
		{
			if (arrayIn[i] > result)
			{
				result = arrayIn[i]; // reset result to new maximum
			}
		}
		return result;
	}
}

