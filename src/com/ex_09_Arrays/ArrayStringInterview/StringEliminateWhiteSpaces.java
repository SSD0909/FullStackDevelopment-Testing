package com.ex_09_Arrays.ArrayStringInterview;

public class StringEliminateWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Removing the white spaces are spacebar and tab spaces
		
		// \\t ----all spaces created by tab
		// \\s-----all spaces including taba nd spacebar spaces 
		//\t \s \f \n are escape sequences
		
		String x= "GOD	HAS GIVEN ME	A WONDERFUL GIFT	THAT NO-ONE CAN		TOUCH IT";
		
		x=x.replaceAll("\\s", "");
		System.out.println(x);
	}

}
