package com.A05_ScannerHackerrank;

import java.util.Scanner;

public class Solution6_splitexpressionstoken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Enter the String");
		        String s = scan.nextLine();
		        
		        String[] result = s.trim().split("[\\s!?,._'@]+");
		        
		        if (s.trim().isEmpty()){
		         System.out.println("0");
		  }else{
		      System.out.println(result.length);
		        for (String sam:result)
		         System.out.println(sam);
		        
		  
		        scan.close();
		    }
		}
	}


