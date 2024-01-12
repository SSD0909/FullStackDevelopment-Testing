package com.ex_09_Arrays.ArrayStringInterview;

public class changestringtouppercasecastingASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="stephy";
		
		char[]a=x.toCharArray();
		
		int size=a.length;
		
		
		
		//now we need to change the entire lower to upper case
		
		int i=0;
		
		while(i!=size) {
			
					
			a[i]=(char)(a[i]-32);
			
			++i;
		}
		System.out.println(x);
		System.out.println(a);
		
	}

}
