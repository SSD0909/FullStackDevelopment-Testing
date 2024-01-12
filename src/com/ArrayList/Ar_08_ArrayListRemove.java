package com.ArrayList;

import java.util.ArrayList;

public class Ar_08_ArrayListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>cars=new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("VW");
		
		System.out.println(cars.remove(0));
		System.out.println(cars);
	}

}
