package com.ex_09_Arrays.ArrayStringInterview;

import java.util.Arrays;

public class AnagramwithStringspaceandcasesensitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String x="He Is Binary";
		String y="he Is brainy";
		
		x=x.replace(" ","");
		y=y.replace(" ","");
		x=x.toLowerCase();
		y=y.toLowerCase();
		
		char [] a=x.toCharArray();
		char[]b=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result=Arrays.equals(a, b);
		if(result==true) {
			
			System.out.println("Its an Anagram");
		}
		else {
			
			System.out.println("Its not an Anagram");
		}
		
		
		
	}

}
