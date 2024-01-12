package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1= new Student(101, "Sonoo", 23);
Student s2= new Student(102, "Ravi", 21);
Student s3= new Student(103, "Hanumat", 25);


ArrayList<Student> list= new ArrayList<Student>();

list.add(s1);
list.add(s2);
list.add(s3);


Iterator itr= list.iterator();

while(itr.hasNext()) {
	
	Student st=(Student)itr.next();
	System.out.println(st.rollNo+ " "+st.name+" "+st.age);
}
	}

}
