package com.ex_09_Arrays.ArrayStringInterview;

public class RotationalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//you need to conect the string with the string itself and check if it contains the keystring
		
		String x= "STEPHY";
		
		String keystring="TEPHYS";
		
	String newstring= x.concat(x);
	
	if(newstring.contains(keystring)) {
		
		
		System.out.println("It is a rotational String");
		
	}
		
	else {
		
		System.out.println("It is not a  rotational String");
		
	}
		
	}

}
