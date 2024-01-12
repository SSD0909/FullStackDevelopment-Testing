package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Books1Impl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//List<String>list=new ArrayList<String>();
		
//String x="Hello";

		
List<Books1>list= new ArrayList<Books1>();


Books1 b1= new Books1(101,"Let us C","Yash","BPB",8);
Books1 b2= new Books1(102,"Data Communications","Foruzan","Mc Graw",4);
Books1 b3= new Books1(103,"Operating questions","Galvin","Wiley",6);

list.add(b1);
list.add(b2);
list.add(b3);

for(Books1 b:list) {
	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
}
	}

}
