package com.ArrayList;

import java.util.ArrayList;

public class Ar_03_GetAddvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<String>cars=new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("VW");
		
		System.out.println(cars.get(0));
		System.out.println(cars.get(1));
		System.out.println(cars.get(2));
		System.out.println(cars.get(3));
		
		System.out.println(cars);
	}

}
