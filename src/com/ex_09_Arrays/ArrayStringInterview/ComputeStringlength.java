package com.ex_09_Arrays.ArrayStringInterview;

public class ComputeStringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x= "ABC Challenge";
		x= x.concat("\0");
		char []y=x.toCharArray();
		
		int count=0;
		int i=0;
		while (y[i]!=0) {
			++count;
			++i;
		}
		System.out.println(count);
		
		System.out.println(x.length());
		
	}

}
