package com.Objects.ArrayMethods;

public class PersonConstructor {
	
	private String name;
	private int age;
	
	PersonConstructor(){
		
		//empty constructor		
	}
	
PersonConstructor(String name, int age){
	
	//constructor with parameters passed for name and age
	
	this.name=name;
	this.age=age;
		
	}

public void say() {
	
	
	System.out.println("My name is "+name+" and age is "+age);
}
}
