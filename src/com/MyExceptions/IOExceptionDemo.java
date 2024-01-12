package com.MyExceptions;

import java.util.Scanner;

public class IOExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner("test");
System.out.println(""+sc.nextLine());
System.out.println("Exception Output: "+ sc.ioException());

sc.close();
}

}
