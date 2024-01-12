package com.BankingApplication;

import java.util.Scanner;

// a menu driven program to test a selection of useful array methods 

public class s03a_SomeUsefulArrayMethods
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

		//5b......next....call fillArray method and pass it array reference
		fillArray(someArray);

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


	//6a......next....
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
}

