package com.ex_09_Arrays.ArrayStringInterview;

public class Copyarrayandreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="ABC Sample";
		
		char [] a= x.toCharArray();
		int size= a.length;
		char[]b=new char[size];
		///here character at the 1st goes to last
		//a, size-i-1 inserted to b,i
		int i=0;
		while(i!=size) {
			
			b[i]=a[size-i-1];
			++i;
		}
		
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
