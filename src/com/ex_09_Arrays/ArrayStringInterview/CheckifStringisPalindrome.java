package com.ex_09_Arrays.ArrayStringInterview;

public class CheckifStringisPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x="LIRIL";
		
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
		
		i=0;
		
		while(i!=size) {
			
			if(a[i]!=b[i]) {
				
				System.out.println("Its not a palindrome");
				System.exit(0);
			}
			else {
				
				++i;
				continue;
			}
		}
			System.out.println("Its  a palindrome");
		
		
		
		
	}

}
