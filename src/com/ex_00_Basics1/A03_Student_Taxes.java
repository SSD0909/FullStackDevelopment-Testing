package com.ex_00_Basics1;


public class A03_Student_Taxes {
int tax;/// only global variable can be declared globally
void texasTax() {
	//declaring the value to the global variable
	//int tax; this will not work it will throw error if its not given a value
	tax=500;
	
	System.out.println(tax);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating instance of the class with reference to object as stax
		A03_Student_Taxes stax=new A03_Student_Taxes();
		// method calling for the object_reference 
		stax.texasTax();
		//once method is called the variable value will be changed from 0 to 500
	}

}
