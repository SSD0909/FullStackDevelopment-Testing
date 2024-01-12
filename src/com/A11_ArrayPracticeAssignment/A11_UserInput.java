package com.A11_ArrayPracticeAssignment;

import java.util.Scanner;

public class A11_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);

System.out.println("Please let us know the count of your favorite things :");
int c=sc.nextInt();
int size=c-1;
//System.out.println(size);
String [] arr= new String[c];
for(int i=0; i<=size;i++) {
	
	
	System.out.println("Enter your thing:");
	arr[i]=sc.next();
	
}
System.out.print("Your favorite  things are:");
for(String str: arr) {
	
	System.out.print(str+" ");
}

sc.close();
	}

}
