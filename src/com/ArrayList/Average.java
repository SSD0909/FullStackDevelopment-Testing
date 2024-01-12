package com.ArrayList;

import java.util.Arrays;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//add 
		int [] x= new int[] {1,2,3,4};
		int sum=0;
		int l=x.length;
		System.out.println(x.length);
		for(int i: x) {
						
			sum+=i;
		}
		
		double avg=(double)sum/l;
		
		System.out.println("Average is"+avg );
		
		
		
		int[]y= new int[5];
		Arrays.fill(y, 1);
		
		System.out.println("Array of elements with value one :"+Arrays.toString(y));
		
		y[2]=-1;
		System.out.println("Array of elements with value with a -1 :"+Arrays.toString(y));
		
		for(int i=0; i<y.length;i++) {
			
			if(y[i]!=-1) {
				
				System.out.println("Ranking is correct for index "+i);
			}
			else {
				System.out.println("Ranking is not correct for index "+i);
			}
		}
		
		for(int i=0; i<y.length;i++) {
			
			if(y[i]!=-1) 
				
				y[i]=-1;
			
		}
		
		System.out.println("The New Array is changed to  "+Arrays.toString(y));
		
	}

}
