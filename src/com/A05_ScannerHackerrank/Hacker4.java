package com.A05_ScannerHackerrank;

public class Hacker4 {

	
	//regular expression to find all the input binary string is of the power of 2 or not
	
	 final static String regularExpression = "^0*10*$";
	 
	 public static void fizzBuzz(int n) {
		    // Write your code here
		    for (int i=1;i<=n;i++){
		        
		        if(i%3==0&&i%5!=0)
		            System.out.println("Fizz");
		            
		           else if(i%5==0&&i%3!=0){
		        System.out.println("Buzz");}
		        else if(i%3==0 && i%5==0 ){
		         System.out.println("FizzBuzz");}
		        else
		        System.out.println(i);
		    }
	 }
}
