package com.ex_00_Basics1;


public class A02_StudentGlobal_Variable {
	
	int id=1000;//global variable
	
//Member variable or class level variable
	void compute(){
		
		 int id =450;///this cannot change the global variable this is unique to method
		 //if you initialize globally it will override the variable and the new id will become 20000
		// method variable, it have access to only this method
		 	 
		System.out.println(id);
	}
void computeTwo() {
	id =20000;
	System.out.println(id);
}
void computeThree() {
	int id=2500;
	System.out.println(id);
}

void computeFour() {

	System.out.println(id);
}
public static void main(String[]args) {
	//create instance of class named student
	A02_StudentGlobal_Variable calvin =new A02_StudentGlobal_Variable(); 

//calvin is the reference where it is in the stack memory and new Student method is in the heap memory
		calvin.compute();
		calvin.computeTwo();
		calvin.computeThree();
		calvin.computeFour();
}
}
