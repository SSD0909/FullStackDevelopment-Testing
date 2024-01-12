package com.ex_01_Basics2;

public class C05_IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score=5;
		if(score==5) {//if(condition1) is true this block will execute
			System.out.println("Excellent");
		}
			else if(score==4) {//else if (condition2) is true this block will execute
				
				System.out.println("Good");
			}
			else {
				System.out.println("Poor");//if no conditions are true then this block will execute
			}
		}

	}

