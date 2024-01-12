package com.MyExceptions;

public class StringIndexOutofBoundExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
String a=" This is like Chipping";
char c=a.charAt(29);
System.out.println(c);

		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("This value is not found");
		}
	}

}
