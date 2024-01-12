package com.ex_11_AdvancedJava.FinalMethod;

public class DbToolsImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//DbTools tool= new DbTools_ETL();
		//it can access only the parent class method using this object creation as final method is used in this class
		DbTools_ETL tool= new DbTools_ETL();
		tool.ETL();
		tool.ETL("Extraction2", "Transformation2", "Loading2");
		
		
	}

}
