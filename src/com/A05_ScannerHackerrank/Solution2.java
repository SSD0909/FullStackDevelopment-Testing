package com.A05_ScannerHackerrank;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		 String A=sc.next();
	        
		 System.out.println("Enter second String");
	       
	        String B=sc.next();
	      
	        int C=A.length()+B.length();
	        
	        System.out.println(C);
        
        if (A.compareTo(B)<=0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        System.out.println((A.substring(0,1).toUpperCase()+A.substring(1)
        +" "+ B.substring(0,1).toUpperCase()+B.substring(1)));
      
        sc.close();
	}

}
