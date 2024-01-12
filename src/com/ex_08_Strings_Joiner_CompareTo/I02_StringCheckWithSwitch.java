package com.ex_08_Strings_Joiner_CompareTo;

import java.util.Scanner;

public class I02_StringCheckWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String symbol;
		
		
		System.out.println("Enter the symbol(square/circle/triangle)");
		
		symbol=sc.next();
		
		switch(symbol) {
		
		case"square":{
			System.out.println("ATTACK");
			break;
		}
		case"circle":{
			System.out.println("BLOCK");
			break;
		}
		case"triangle":{
			System.out.println("JUMP");
			break;
		}
		default:{
			System.out.println("Invalid choice");
			break;
		}
		}
		
		sc.close();
		
		
		
		
		
	}

}
