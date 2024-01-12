package com.A05_ScannerHackerrank;


	import java.util.Scanner;
	public class Solution4_string_comparisonsubstring {

	    public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        String sample="";
	      
	        int start=0;
	       
	        
	        smallest=s.substring(start, k);
	        largest=s.substring(start, k);
	        
	     
	    for(int i = 0; i<=s.trim().length()-k; i++)
	    {
	        sample = s.substring(i,i+k);
	        if(sample.compareTo((largest))>0)
	        {
	            largest = sample;
	        }
	        else if(sample.compareTo((smallest))<0)
	        {
	            smallest = sample;
	        }
	    }
	    return smallest + "\n" + largest;
	}
	    


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the string without spaces");
	        String s = scan.next();
	        System.out.println("Enter the length to get the smallest and largest");
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
	}
	
