package com.Objects.ex_01;

public class ClassInJavaImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassInJava student= new ClassInJava("Sara",12,"Aneesh","25896385"," 2323 Gerald Street, NewYork");
		
		System.out.println("The Student name is : "+student.name);
		System.out.println("The Student rollno is : "+student.rollno);
		System.out.println("The Student Father's name is : "+student.fathername);
		System.out.println("The Student's Address  is : "+student.address);
		System.out.println("The Student's Contact Info  is : "+student.contactno);
	}

}
