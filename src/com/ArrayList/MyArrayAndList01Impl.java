package com.ArrayList;

import java.util.ArrayList;

public class MyArrayAndList01Impl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>list= new ArrayList<String>();
		
		list.add("Mango");
		list.add("Pear");
		list.add("Apple");
		list.add("Orange");
		list.add("Plum");
		list.add("Grape");
		
		for(String x: list) {
			
			System.out.println(x);
		}
		
		// new array in constructor
		
		//create an instance of the class
	    //MyArrayAndList01
		//m has a reference to an array
		//every time a new object is created it points to an arraylist
		
		//calling the constructor, default with no param
		MyArrayAndList01 m01=new MyArrayAndList01();
		// object have the array 
		m01.mySecondArrayList.add("Tom");
		m01.mySecondArrayList.add("Sam");
		m01.mySecondArrayList.add("Tina");
		
		
		System.out.println(m01.mySecondArrayList);
		
		//String[]x= {"Sara","Evan","Sana","Mina"};
		//converting an arraylist to array 
		String[] newarray= m01.mySecondArrayList.toArray(new String[0]);
		System.out.println("Content of new arra y");
		for(String x: newarray) {
			
			System.out.println(x);
		}
		
		
		m01.convert(newarray);
	
		
		m01.replace(3);
		
		System.out.println(m01.compact());
		
	}

}
