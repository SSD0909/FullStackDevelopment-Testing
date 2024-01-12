package com.A05_ScannerHackerrank;

public class HACKER6 {
	public static int fourthBit(int number) {
	    // Write your code here
	    int[] x=new int[100];
	    int[]y=new int[100];
	    int i=0;
	    while(number!=0){
	      x[i]=number%2;
	      number=number/2;
	      i++;  
	    }
	for(int j=i;j>=0;j--){
	 y[j]=x[j];

	}
	return y[3];
	    }

	

}
