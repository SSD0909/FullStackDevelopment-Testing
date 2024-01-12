package com.ArrayList;

import java.util.ArrayList;

public class Ar_01_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list= new ArrayList<String>();
		
		list.add("Mango");
		list.add("Orange");
		list.add("Pear");
		list.add("Plum");
		
		System.out.println(list);
		
		for(String v: list) {
			System.out.println(v);
			
			
		}
		System.out.println(list.get(3));
	}

}
