package com.ex_08_Strings_Joiner_CompareTo;

import java.util.StringJoiner;

public class I05_String_JoinerWithPrefixSuffix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner sj=new StringJoiner(":","{","")	;
		StringJoiner sj1=new StringJoiner(",",":","}")	;
		
		sj.add("accountName");
		sj.add("Tony");
		sj1.add("accountPassword");
		sj1.add("Stark");
		//string as string literal
		String result =sj.toString();
		String resul1=sj1.toString();
		System.out.print(result);
		System.out.println(resul1);
		
		
	}

}
