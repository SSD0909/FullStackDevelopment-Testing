package com.A10_StringMethods;

import java.util.Arrays;

public class A10_StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vowels = "a::b::c::d:e";

	    // splitting the string at "::"
	    // storing the result in an array of strings
	    String[] result = vowels.split("::");

	    // converting array to string and printing it
	    System.out.println("result = " + Arrays.toString(result));
	  }


}
