package com.ex_10_Class;

public class Person {
	//member variables
	//attributes
	String name, streetname, state;
	int age, streetnumber ,zipcode;
	
	
	
	
	//method in class with no return value
	public void say() {
		
		System.out.println("My name is:"+name+",this year I will be "+age+"years old");
	}
public void details() {
	
	System.out.println("My name is:"+name+". My address is : "+streetnumber+" "+streetname+
			" ,"+state+" -"+zipcode);
}
	
}
