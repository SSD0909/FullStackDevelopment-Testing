package com.ex_09_Arrays.ArrayStringInterview;

public class PangramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// pangram is a string in which all alphabets are present in a string
		
		String x="THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		
		x=x.replace(" ", "");
		
		char [] a= x.toCharArray();
		
		 int size= a.length;
		 
		 int []b= {0,0,0,0,0,0,0,0,0,
				   0,0,0,0,0,0,0,0,0,
				   0,0,0,0,0,0,0,0};
		
		 int i=0;
		 
		 while(i!=size) {
			 // giving the index of the ascii value of the alphabet, since its a capital letter we are minusby65
			 int index=a[i]-65;
			 
			 b[index]=1;
			 ++i;
			 	
		 }
		
		 i=0;
		while(i!=26) {
			
			if(b[i]==1) {
				
				++i;
			}
			else {
				
				System.out.println("Its not pangram");
				System.exit(0);
			}
		}
			System.out.println("Its a pangram");
		}
		
		
		
		
		
	}


