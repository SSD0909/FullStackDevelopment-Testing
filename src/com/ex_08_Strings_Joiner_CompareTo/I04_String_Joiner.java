package com.ex_08_Strings_Joiner_CompareTo;

import java.util.StringJoiner;

public class I04_String_Joiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//joins strings with delimiter
	StringJoiner sj=new StringJoiner(",")	;
	
	//add
	sj.add("aaaa");
	sj.add("bbbb");
	sj.add("cccc");
	
	String result =sj.toString();
	System.out.print(result);
		
	}

}
