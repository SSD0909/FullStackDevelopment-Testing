package com.ex_01_Basics2;

import java.util.Scanner;

public class C07_ScannerSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		System.out.println("Please Enter Your Score : ");
	
		
		int score =in.nextInt();
		
		switch(score) {
		
		case 5:{
			System.out.println("Excellent");
			break;
		}
		
		case 4:{
			System.out.println("Good");
			break;
		}
		default:{
			System.out.println("Not good");
			
		}
		}
		in.close();
		}

	}


