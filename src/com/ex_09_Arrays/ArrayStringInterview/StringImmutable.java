package com.ex_09_Arrays.ArrayStringInterview;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Strings are immutable you cannot a string strored in a variable
		String x="STEPHY ";
	 String y= " DANIEL";
	 x.concat(y);
	 System.out.println(x);
	 
	 
	 //If you want to make it mutable you need to use the stringBuffer class or StringBuilder class
	 
	 StringBuffer x1=new StringBuffer("STEPHY ");
	 StringBuffer y1=new StringBuffer("DANIEL");
	 x1.append(y1);
	 System.out.println(x1);
		
	 
	 StringBuilder x2=new StringBuilder("STEPHY ");
	 StringBuilder y2=new StringBuilder("DANIEL");
	 x2.append(y2);
	 System.out.println(x2);

	}

}
