package com.LoopPracticeSBA;

public class S01_DisplayPatternC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Display Pattern C");
		int numberOfLines=6;
		for(int i=1;i<=numberOfLines;i++) {
			for(int j=numberOfLines-i;j>=1;j--) {
				
				System.out.print(" ");
				
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
