package com.ex_09_Arrays.ArrayStringInterview;

public class VerifyStringcontainsonlyIntegers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="895623";
		
		char[]x=s.toCharArray();
		
		int size=x.length;
		
		int i=0;
		
		while(i!=size) {
			
			if(x[i]>='0' && x[i]<='9') {
				
				++i;
			}
			else {
			System.out.println("String is not an integer");
			System.exit(0);
			}
		}
		
		System.out.println("String is an integer");
		
	}

}
