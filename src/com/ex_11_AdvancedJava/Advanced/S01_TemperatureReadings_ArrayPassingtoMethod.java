package com.ex_11_AdvancedJava.Advanced;

import java.util.Scanner;

public class S01_TemperatureReadings_ArrayPassingtoMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double[]temperature;
 temperature=enterTemps();
 displayTemps(temperature);
	}
	
	static double[] enterTemps(){
		Scanner keyboard=new Scanner(System.in);
		double[]temperatureOut=new double[7];
		for (int i=0;i<temperatureOut.length;i++) {
			System.out.println("Enter maximum temperature for day"+(i+1));
			temperatureOut[i]=keyboard.nextDouble();
			
		}
		
		return temperatureOut;
	}
static void displayTemps(double[]temperatureOut) {
		
		///... is variable argument---if i need to read an array
	//It can provide n number of arguments in method call variable argument ...varargs
		System.out.println();
		System.out.println("Sending Array ");
		System.out.println(temperatureOut.length);
		System.out.println("--------------------------------");
	for (int i=0;i<temperatureOut.length;i++) {
			System.out.println(temperatureOut[i]);
		}
}
}
