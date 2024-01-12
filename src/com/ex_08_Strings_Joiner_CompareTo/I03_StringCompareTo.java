package com.ex_08_Strings_Joiner_CompareTo;

import java.util.Scanner;

public class I03_StringCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int comparison;
String s1;
String s2;
Scanner sc=new Scanner(System.in);

System.out.println("Enter a String :");
s1=sc.next();
System.out.println("Enter another String :");
s2=sc.next();

//compareTo compares the characters position in a string, lexicographically and give the value 
comparison=s1.compareTo(s2);
if(comparison<0) {
	
	System.out.println(s1 + "comes before" + s2 +"in the alphabet");
	}
else if (comparison>0) {
	System.out.println(s2 + "comes before" + s1 +"in the alphabet");
}
else {
	System.out.println("Strings are identical");
}
sc.close();
	}

}
