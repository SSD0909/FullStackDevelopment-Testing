package com.LoopPracticeSBA;

import java.util.Scanner;

public class S01_NestedPatternScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of the square :");
		int num=sc.nextInt();
for(int i=0;i<num;i++) {
	
	for(int j=0; j<num;j++) {//the inner loop will start fresh on every iteration of i and loops until the j breaks
		
		System.out.print("*");
	}
	System.out.println();
	
}
	}

}
