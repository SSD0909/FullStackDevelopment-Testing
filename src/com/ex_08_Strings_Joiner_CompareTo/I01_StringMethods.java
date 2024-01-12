package com.ex_08_Strings_Joiner_CompareTo;

import java.util.Scanner;

public class I01_StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);
//create a new String 
String str;
//get user  to enter a String
System.out.println("Please Enter a String without spaces : ");

str=keyboard.next();

//display the length of the users string
System.out.println("The length of String is : "+str.length());

//display the 3rd character of the users string

System.out.println("The third character of String is : "+str.charAt(2));


//display a selected part of the users string
System.out.println("The selected part of  of String is : "+str.substring(1,4));

//display users string joined with another string

System.out.println(str.concat(" : This is")+" the concatenated part of  of String is : ");

//display users string in uppercase

System.out.println("This is the uppercase :"+str.toUpperCase());

//display users string to lower case
System.out.println("This is the lowerCASE :"+str.toLowerCase());

keyboard.close();
	}

}
