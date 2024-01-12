package com.Objects.ex_01;

public class Puppy {

	// here in class variables we can declare only primitive data types like int, char, boolean, double, float for a constructor level 4
	//objects dont want to be declared in the class if it needs to be passed in the constructor
	int puppyAge, telephone;
	String ownerName,address;
	public Puppy(String name)
	{
		System.out.println("The name of the puppy is :"+name);
	}
	
	void setAge(int age) {
		
		puppyAge=age;
	}
	void setownerName(String oName ) {
		ownerName=oName;
		System.out.println("Puppy's owner is : "+ownerName);
		
	}
void settelephone(int tel) {
		
	telephone=tel;
	System.out.println("The Telephone Number of the puppy's owner is : "+telephone);
	}
void setaddress(String addr) {
	address=addr;
	System.out.println("The Address of the puppy's owner` is : "+address);
}

	public int getAge() {
		
		return puppyAge;
		
	}
public String getownerName() {
		
		return ownerName;
		
	}
public String getaddress() {
	
	return address;
	
}
public int gettelephone() {
	
	return telephone;
	
}
}
