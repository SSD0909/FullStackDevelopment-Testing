package com.Objects.ex_01;

public class PuppyImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Puppy pup =new Puppy("Tiger");
		
		// if the age is set you cannot get the value even if the object is able to call the puppyage
		//if value of the puppy age is passed then only the attributes inside the methos will get the value passed on
		pup.setAge(5);
		System.out.println("The age of the puppy : "+pup.getAge()+"years");
		System.out.println("The age of the puppy : "+pup.puppyAge);
		
		
		pup.setownerName("Jacob");
		pup.settelephone(986985297);
		pup.setaddress("678 Silver Street , Colorado");
		
		System.out.println("The owner details of the puppy is : "+pup.getownerName()+" ,"+pup.getaddress()+", Tel : "+pup.gettelephone()+" ");
		
	}

}
