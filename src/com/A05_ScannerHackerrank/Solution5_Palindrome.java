package com.A05_ScannerHackerrank;

import java.util.Scanner;

public class Solution5_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B="";
	        //every time initiable an empty string if any value comes in
	        int l=A.length();
	        
	        //loop created for the reverse string where i is the length of original string -1 and decreement
	        for(int i=l-1;i>=0;i--){
	            //each character is added to the new string until it reach the first character of original string
	            B = B +A.charAt(i);
	        }
	            if(A.equals(B)){
	                System.out.println("Yes");
	            }
	            else{
	                 System.out.println("No");
	            }
	        }
	        /* Enter your code here. Print output to STDOUT. */
	        
	    }




