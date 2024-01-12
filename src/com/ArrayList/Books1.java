package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Books1 {
	List<Books1>list;
	
Books1(){
	
	this.list=new ArrayList<>();

	}
int id;
String name, author, publisher;
int quantity;
public Books1(int id, String name, String author, String publisher,int quantity) {
	
	this.id=id;
	this.author=author;
	this.name=name;
	this.publisher=publisher;
	this.quantity=quantity;
	
	
}
}
