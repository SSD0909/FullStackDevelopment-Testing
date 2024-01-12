package com.ex_09_Arrays.ArrayStringInterview;

public class CopycharactersOfStringtoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="ABC Sample";
		
		char [] a= x.toCharArray();
		int size= a.length;
		char[]b=new char[size];
		
		int i=0;
		while(i!=size) {
			
			b[i]=a[i];
			++i;
		}
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
