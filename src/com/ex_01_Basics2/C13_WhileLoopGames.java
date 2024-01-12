package com.ex_01_Basics2;

import java.util.Scanner;

public class C13_WhileLoopGames {

	public static void main(String[] args) {
		
		int num=0;//this is a local variable we need to initialize it to zero as its in a method.
		//if its in a class level we don't want to initialize it as default it will be zero for primitive data types
		//for object types the variable is initialized to null
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your input : ");
		System.out.println("1: watermelon, 2: Banana, 3: Peach");
		
		
		
		while(num!=-1) {
			num=sc.nextInt();
			if(num==1) {
				System.out.println("You cut the watermelon");}
				else if(num==2) {
					System.out.println("You cut the Banana");
				}
				else if(num==3) {
					System.out.println("You cut the peach");
				}
				else if(num==0)
				{
					System.out.println("You cut the Thunder game Termination");
					num=-1;
								
				
			}
			
		}
		
sc.close();
	}

}
