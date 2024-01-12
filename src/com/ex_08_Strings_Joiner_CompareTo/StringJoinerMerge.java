package com.ex_08_Strings_Joiner_CompareTo;

import java.util.StringJoiner;

public class StringJoinerMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj=new StringJoiner(":","{","}")	;
		StringJoiner sj1=new StringJoiner(",","[","]")	;
		//merge method will take only the initial object delimiters
		sj.add("accountName").add("Tony");
		sj1.add("accountPassword").add("Stark");
		//string as string literal
		//String result =sj.toString();
		//String resul1=sj1.toString();
		System.out.print(sj.merge(sj1).toString());
	}

}
