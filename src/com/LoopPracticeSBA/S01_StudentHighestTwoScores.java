package com.LoopPracticeSBA;

import java.util.Scanner;

public class S01_StudentHighestTwoScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//userInput for Student name and scores and total students
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of students");
int numberOfStudents=sc.nextInt();


String studentName="",student1="",student2="";
int score=0,highestScore=0,secondHighestscore=0;


System.out.println("Enter the Student name and score ");
for(int i=0;i<numberOfStudents;i++) {
	
	System.out.println("Student:"+(i+1)+"\n   Name:");
	studentName=sc.next();
	
	
	System.out.println("   Score: ");
	score=sc.nextInt();
	
	if(i==0) {
		
		highestScore=score;
student1=studentName;
		
	}
	else if(i==1 && score>highestScore) {
		
		
		secondHighestscore=highestScore;
		highestScore=score;
		
		student2=student1;
		student1=studentName;
			}
	
	else if(i==1) {
		secondHighestscore=score;
		student2=studentName;
	}
	else if(i>1 && score>highestScore &&score>secondHighestscore) {
		secondHighestscore=highestScore;
		highestScore=score;
		
		student2=student1;
		student1=studentName;
	}
	else if(i>1 && score>secondHighestscore) {
		
		secondHighestscore=score;
		student2=studentName;
	}
}

System.out.println("The Highest scoring student is "+student1+". The Second highest score student is "+student2);
	}

}
