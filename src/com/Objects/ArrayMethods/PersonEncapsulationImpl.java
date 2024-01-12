package com.Objects.ArrayMethods;

public class PersonEncapsulationImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonEncapsulation p=new PersonEncapsulation();
		
		p.SetAge(35);
		p.SetName("Jacob");
		
		System.out.println("The name of the person "+p.getName()+" and age is "+p.getAge());
		
	}

}
