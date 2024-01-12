package com.ex_11_AdvancedJava.FinalMethod;

public class DbTools {
	
	String E= "Extraction1";
	String T= "Transformation2";
	String L= "Loading3";
	//you cannot use this method 
	final void ETL() {
		
		
		System.out.println(E+T+L);
	}

}
