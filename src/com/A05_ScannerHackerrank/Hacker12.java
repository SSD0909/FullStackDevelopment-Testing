package com.A05_ScannerHackerrank;

public class Hacker12 {

	
	public static int isPrime(long n) {
	    // Write your code here
	    if(n==2)
	    return 1;
	    if(n%2==0)
	    return 2;
	    
	for( int i=3; i*i<=n;i+=2){
	    
	    if(n%i==0)
	    return i;
	}
	return 1;
	    }
}
