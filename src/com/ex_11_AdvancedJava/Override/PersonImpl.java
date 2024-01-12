package com.ex_11_AdvancedJava.Override;

public class PersonImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChineeseStudent s = new ChineeseStudent();
		AmericanStudentNeedParentmethod a=new AmericanStudentNeedParentmethod();
		s.name="Sara";
		s.age=9;
		s.say();
		a.say();
	}

}
