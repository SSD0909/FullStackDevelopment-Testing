package com.LoopPracticeSBA;

public class S01_KilometersConversionSinglelineprinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final double MILES_KILOMETER=1.609;
System.out.println("Miles     Kilometers | Kilometers     Miles");
for(int m=1, k=20; m<=10 && k<=65;m++,k+=5) {
	
	System.out.printf("%-12d%7.3f",m,MILES_KILOMETER*m);
	System.out.print("  |  ");
	System.out.printf("%-9d%10.3f\n",k,(k/MILES_KILOMETER));
}
		
		
		
		
		
	}

}
