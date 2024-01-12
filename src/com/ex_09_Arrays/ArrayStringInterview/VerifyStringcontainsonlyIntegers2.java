package com.ex_09_Arrays.ArrayStringInterview;

public class VerifyStringcontainsonlyIntegers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
String s="895623";
		
		
		int size=s.length();
		
		int i=0;
		
		while(i!=size) {
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				
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
