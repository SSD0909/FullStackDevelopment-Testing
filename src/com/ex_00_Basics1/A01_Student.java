package com.ex_00_Basics1;


public class A01_Student {
	
	//int id=100; Global declaration of variables can be accessed by any methods
	
//Member variable or class level variable
	void compute(){
		
		int id=100;//local variable declaration and initialization
		// method variable, it have access to only this method
		 	 
		System.out.println(id);
	}
void computeTwo() {
	int id =2000;
	System.out.println(id);
}
public static void main(String[]args) {
	//create instance of class named student
	A01_Student calvin =new A01_Student(); 

//calvin is the reference where it is in the stack memory and new Student method is in the heap memory
		calvin.compute();
		calvin.computeTwo();
}
}
