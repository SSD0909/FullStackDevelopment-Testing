package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class BooksImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Books>list= new ArrayList<Books>();
		
		
		Books b1= new Books(101,"Let us C","Yash","BPB",8);
		Books b2= new Books(102,"Data Communications","Foruzan","Mc Graw",4);
		Books b3= new Books(103,"Operating questions","Galvin","Wiley",6);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Books b:list) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
	}

}
