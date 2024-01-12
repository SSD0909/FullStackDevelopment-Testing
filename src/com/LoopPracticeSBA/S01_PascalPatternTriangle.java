package com.LoopPracticeSBA;

public class S01_PascalPatternTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
for(int line=1; line<=5;line++) {
			
			for(int j=5;j>=line;j--) {
				System.out.print(" ");
			}
			
			for(int j1=1;j1<=line;j1++) {
				System.out.print("1 ");///print the row of stars
				
			}
			System.out.println();//outer loop to print the nextline
		}		
	}

}
/*
//Pascals triangle;

for(int line=1; line<=5;line++) {
			
			for(int j=5;j>=line;j--) {
				System.out.print(" ");
			}
			int c=1;
			for(int j1=1;j1<=line;j1++) {
				System.out.print(c+" ");///print the row of stars
				c=c*(line-j1)/j1;
			}
			System.out.println();//outer loop to print the nextline
		}		
	}

}







*/