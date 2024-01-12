package com.ex_09_Arrays.ArrayStringInterview;

public class InputStringIsEmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Verifying the length of the string, we can makesure it is empty or not.
		//"" this is the only string which is empty with length zero if string is NULL its nota  string
String x="";

if(x.length()==0) {
	System.out.println("Empty String");
	
	}
else {
	
	System.out.println("Not Empty and length is :"+x.length());
}
	}

}
