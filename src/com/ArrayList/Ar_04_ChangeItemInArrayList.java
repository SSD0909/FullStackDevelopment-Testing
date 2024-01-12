package com.ArrayList;

import java.util.ArrayList;

public class Ar_04_ChangeItemInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String>cars=new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("VW");
		
		System.out.println(cars.set(0,"Audi"));
		System.out.println(cars.get(0));
	}

}
