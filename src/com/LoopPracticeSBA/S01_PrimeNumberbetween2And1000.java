package com.LoopPracticeSBA;

/*
(Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display all
the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers
per line. Numbers are separated by exactly one space.
*/
public class S01_PrimeNumberbetween2And1000 {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 8 per line
		int count = 0; // Count the number of prime numbers

		System.out.println(
			"The prime numbers between 2 and 1,000, inclusive are \n");

		// Repeatedly find prime numbers
		for (int number=2;number<=1000;number++){
			// Assume the number is prime
			boolean isprime=true;
				// Is the current number prime?
			
			// Test whether number is prime
			for (int divisor = 2; divisor <= number/ 2; divisor++) {
					if(number%divisor==0) {
						// If true, number is not prime
						isprime = false;	// Set isPrime to false
					break;	// Exit the for loop
					}
					
			}
			if(isprime) {
				count++;
				if(count%NUMBER_OF_PRIMES_PER_LINE==0) {
					System.out.println(number);
				}
				else {
					System.out.print(number+" ");
				}
			}
		}
	}
}