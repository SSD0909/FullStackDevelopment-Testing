package com.LoopPracticeSBA;

public class S01_KilogramstoPounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double KILOGRAM_POUNDS=2.2;
		System.out.println("Kilograms      Pounds");
		for(int k=1; k<=199;k++) {
		
			System.out.printf("%-15d%-10.2f\n",k,k*KILOGRAM_POUNDS);
			
		}
	}

}
