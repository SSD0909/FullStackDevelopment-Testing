package com.A07_ControlFlow;

import java.util.Scanner;

public class A05_ControlFlow5_Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner (System.in);

System.out.println("Please Enter Your score to know the grade ");

int score=sc.nextInt();

if(score>=90&&score<100) {
	
	System.out.println(" Your Grade is A");
	}
else if (score>=80&&score<89) {
	System.out.println(" Your Grade is B");
}
else if (score>=70&&score<79) {
	System.out.println(" Your Grade is C");
}
else if (score>=60&&score<69) {
	System.out.println(" Your Grade is D");
}
else {
	System.out.println("Score out of range");
	}
sc.close();
}
	}


