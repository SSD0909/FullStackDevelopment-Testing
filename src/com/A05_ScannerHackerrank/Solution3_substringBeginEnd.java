package com.A05_ScannerHackerrank;

import java.util.Scanner;

public class Solution3_substringBeginEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		   
		        Scanner in = new Scanner(System.in);
		        String S = in.next();
		        int start = in.nextInt();
		        int end = in.nextInt();
		        
		        String x=S.substring(start, end);
		        
		        System.out.println(x);
		    }
		
	

}
