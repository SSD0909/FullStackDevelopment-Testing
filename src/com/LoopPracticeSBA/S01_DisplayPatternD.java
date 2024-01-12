package com.LoopPracticeSBA;

public class S01_DisplayPatternD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Display Pattern C");
		int numberOfLines=6;
		for(int i=0;i<numberOfLines;i++) {
			for(int j=0;j<i;j++) {
				
				System.out.print(" ");
				
			}
			for(int k=0;k<numberOfLines-i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
