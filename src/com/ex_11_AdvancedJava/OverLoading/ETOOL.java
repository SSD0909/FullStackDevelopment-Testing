package com.ex_11_AdvancedJava.OverLoading;

public class ETOOL {
	
	
	void ETOOLS() {
		
		String E ="MySQL";
		String T="SQOOP";
		String L ="hdfs";
		
		System.out.println(E+T+L);
	}
	
	void ETOOLS(String ETL) {
		
		System.out.println(ETL.toUpperCase());
	}
void ETOOLS(String E, String T, String L) {
		
		System.out.println(E + T + L);
}

void ETL() {
	
	String E= "Extraction1";
	String T= "Transformation2";
	String L= "Loading3";
	
	String d=E+T+L;
	System.out.println(d.toUpperCase());
}
void ETL(String E, String T, String L) {
	System.out.println(E + T + L);
	}
void ETL(String string) {
	
	System.out.println("The String is :"+string);
}
}
	

