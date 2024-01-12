package com.Objects.ex_01;

public class MemberImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_cust student = new Student_cust();
		//student.callBack();
		Teacher_cust teacher=new Teacher_cust();
		//teacher.callBack();
		
		//Store mystore=new Store();
		//mystore.storemember();
		
		//Object [] walmart= {student,teacher};
		
		Member [] walmart= {student,teacher};
		for(Member storemember:walmart) {
			
			storemember.callBack();
		}
		
		
	}

}
