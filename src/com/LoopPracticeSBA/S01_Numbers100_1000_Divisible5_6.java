package com.LoopPracticeSBA;

public class S01_Numbers100_1000_Divisible5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Numbers per line is constant
		final int NUMBER_PER_LINE=10;
		int counter=0;
		for(int i=100;i<=1000;i++) {
			
			if(i%5==0 && i%6==0) {
				//the counter will increment to each number divisible by 5 or 6 
				counter++;
			//if(counter is divisble by 10 then print the number)
			if(counter%NUMBER_PER_LINE==0) 
				System.out.println(i);
			
			else 
				System.out.print(i+" ");
			}
				
		}

	}

}
