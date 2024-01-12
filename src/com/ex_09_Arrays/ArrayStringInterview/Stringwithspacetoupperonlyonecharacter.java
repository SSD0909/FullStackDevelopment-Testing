package com.ex_09_Arrays.ArrayStringInterview;

public class Stringwithspacetoupperonlyonecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x= "perscholas java learning";
		
		char[]a=x.toCharArray();
		
		int size=a.length;
		
		int i=1;
		
		a[0]=(char)(a[0]-32);
		while(i!=size) {
			
			if(a[i]==' ') {
				
				a[i+1]=(char)(a[i+1]-32);
			}
			++i;
		}
		System.out.println(a);
		System.out.println(x);
	}

}
