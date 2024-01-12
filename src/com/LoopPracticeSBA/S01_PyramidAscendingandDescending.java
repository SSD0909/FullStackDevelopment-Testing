package com.LoopPracticeSBA;

/*
(Display numbers in a pyramid pattern) Write a nested for loop that prints the
following output:
*/
public class S01_PyramidAscendingandDescending {
	public static void main(String[] args) { 
		int startRight = 0,	// Initialize decending numbers
			 endSpace = 7;		// Initialize number of white space in row
		// Display number of rows and numbers in each row
		for (int row = 1; row <= 128; row += row) {///lines in the pattern
			
			for(int startspace=0;startspace<endSpace;startspace++) {
				System.out.print("    ");
			}

			
		 for (int a=1; a<=row;a+=a) {
				System.out.printf("%4d",(a));}

	for(int k = startRight;k>0;k/=2 ) {
		System.out.printf("%4d",(k));
			}
				System.out.println();//endline
				
				endSpace--;//decrement endspace
				startRight=row;//assign row to starright
		 }
	}
}
	