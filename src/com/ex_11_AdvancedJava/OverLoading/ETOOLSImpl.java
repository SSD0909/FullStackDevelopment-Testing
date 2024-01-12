package com.ex_11_AdvancedJava.OverLoading;

public class ETOOLSImpl {
	
	//ETL(String E, String T, STring L)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String E= "Extraction10";
		String T= "Transformation20";
		String L= "Loading30";
		ETOOL obj= new ETOOL();
		
		obj.ETOOLS();
		obj.ETOOLS("hdfs");
		obj.ETOOLS("MySQL","SQOOP","SQOOP");
		
		obj.ETL("Extraction1","Transformation2","Loading3");
	    obj.ETL(E+T+L);
		
		
	}

}
