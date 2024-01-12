package com.MyExceptions;

public class NullPointerException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
String a = null;
System.out.println(a.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("No data in your String");
		}
		
		
		
		
	}

}
