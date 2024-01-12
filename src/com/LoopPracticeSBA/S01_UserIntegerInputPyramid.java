package com.LoopPracticeSBA;

import java.util.Scanner;

public class S01_UserIntegerInputPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Please enter a number between 1to 15:4
   1 
  2 1 2 
 3 2 1 2 3 
4 3 2 1 2 3 4 

		 * 
		 * */
Scanner sc=new Scanner(System.in);

System.out.println("Please enter a number between 1to 15");
int  num=sc.nextInt();

for(int line=1; line<=num;line++) {
	
	for(int j=num-line;j>=1;j--) {
		System.out.print(" ");
	}
	
	for(int k=line;k>=2;k--) {
		System.out.print(k+" ");///print the row of stars
		
	}
	for(int r=1; r<=line;r++) {
		System.out.print(r+" ");
	}
	System.out.println();//outer loop to print the nextline
}		
}



	

}
