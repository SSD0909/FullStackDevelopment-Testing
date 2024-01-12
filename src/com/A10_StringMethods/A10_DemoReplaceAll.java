package com.A10_StringMethods;

public class A10_DemoReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str1 = "Java123is456fun";

		    // regex for sequence of digits
		 
		 //"\\d+" is a regular expression that matches one or more digits. 
		    String regex = "\\d+";

		    // replace all occurrences of numeric
		    // digits by a space
		    System.out.println(str1.replaceAll(regex, " "));
		  }


}
