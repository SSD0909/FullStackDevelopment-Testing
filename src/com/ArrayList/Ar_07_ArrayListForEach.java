package com.ArrayList;

import java.util.ArrayList;

public class Ar_07_ArrayListForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>cars=new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("VW");
		
		
		for(String c:cars)
		System.out.println(c);
	}

}
