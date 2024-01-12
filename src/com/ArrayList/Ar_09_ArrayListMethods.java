package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Ar_09_ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[]arrayofFriends= {"Jenny","Ben","Lovely","Cassi"};


//converting an array to arraylist using arrays.asList method

ArrayList<String>friendsList=new ArrayList<>(Arrays.asList("Jenny","Ben","Lovely","Cassi"));
		
		//Get element
System.out.println(arrayofFriends[1]);
System.out.println(friendsList.get(2));

//get size
System.out.println(arrayofFriends.length);
System.out.println(friendsList.size());

//add on element
friendsList.add("Mitch");
System.out.println(friendsList.get(1));

//set an element

arrayofFriends[0]="Carl";
System.out.println(arrayofFriends[0]);
friendsList.set(0,"Carl");
System.out.println(friendsList.get(0));

//remove an element

friendsList.remove(1);
System.out.println(friendsList.get(1));

		System.out.println(arrayofFriends);
		System.out.println(friendsList);
		
		
	}

}
