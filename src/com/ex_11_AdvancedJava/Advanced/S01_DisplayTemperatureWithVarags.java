package com.ex_11_AdvancedJava.Advanced;

public class S01_DisplayTemperatureWithVarags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double [] temperature= {7.5,8.2,7.7,11.3,10.75};
		//System.out.println("Sending Array");
		
		/*displayTemps(temperature);
		System.out.println();
		System.out.println("Sending Individual ");
		
		
		displayTemps2(temperature);
		System.out.println();
		System.out.println("Sending Individual 2");
		*/
		displayTemps(7.6,8.2,7.7,11.3,10.75);
		displayTemps2(7.52,8.2,7.7,11.3,10.75);
	}
		
static void displayTemps(double...temperatureIn) {
		
		///... is variable argument---if i need to read an array
	//It can provide n number of arguments in method call variable argument ...varargs
		System.out.println();
		System.out.println("Sending Array ");
		System.out.println(temperatureIn.length);
		System.out.println("--------------------------------");
	/*	for (int i=0;i<temperatureIn.length;i++) {
			System.out.println(temperatureIn[i]);
		}*/
		
		for(double x:temperatureIn) {
			System.out.println(x);
		}
		
	}
	static void displayTemps2(double...temperatureIn) {
		
		// we use it for the user entry point values ....in which we cast the entry value from the jsp page
		
		System.out.println();
		System.out.println("Sending Individual ");
				System.out.println("Sending Array ");
		System.out.println(temperatureIn.length);
		System.out.println("--------------------------------");
		/*for (int i=0;i<temperatureIn.length;i++) {
			System.out.println(temperatureIn[i]);
		}*/
		for(double x1:temperatureIn) {
			System.out.println(x1);
		}
		
	}
	

}
