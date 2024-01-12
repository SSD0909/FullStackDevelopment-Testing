package com.ex_09_Arrays.ArrayStringInterview;

import java.util.Arrays;

public class AnagramSimpleStringwithoutspaces {
//https://www.youtube.com/watch?v=PqSZVIP8tBI&list=PLqaka-z03VyXd_UGTstCf73OAqPbPKwBN&index=20
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Anagrams are strings which have same letters but arranged different
		///1.sort
		//2.compare
		
		String x="BINARY";
		String y="BRAINY";
		
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
