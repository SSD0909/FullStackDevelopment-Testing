package com.LoopPracticeSBA;

public class S01_DisplayStars3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  Pattern printing of * of count 5 in 5 rows
		 * logic is inner loop starts from 1 ends at 5 and print stars , outer loop will get to nextline
*****
*****
*****
*****
*****
*/
for(int i=1; i<=5;i++) {
	for(int j=1;j<=5;j++) {
		System.out.print("*");///print the row of stars
	}
	System.out.println();//outer loop to print the nextline
}
			
			
	}

}
