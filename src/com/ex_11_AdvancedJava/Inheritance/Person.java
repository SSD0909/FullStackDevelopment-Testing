package com.ex_11_AdvancedJava.Inheritance;

public class Person {

	protected String name;
	protected int age;
	
	Person(){
		
		System.out.println("Parent class Person constructor is created");
	}
	
	
	public void say() {
		
		System.out.println("Person is speaking");
	}
	
}
