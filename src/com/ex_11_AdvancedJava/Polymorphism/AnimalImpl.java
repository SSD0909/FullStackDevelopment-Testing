package com.ex_11_AdvancedJava.Polymorphism;

public class AnimalImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal myanimal=new Animal();
		
		Animal myDog= new Dog();
		
		Animal myPig=new Pig();
		
		myanimal.animalSound();
		myDog.animalSound();
		myPig.animalSound();
		
	}

}
