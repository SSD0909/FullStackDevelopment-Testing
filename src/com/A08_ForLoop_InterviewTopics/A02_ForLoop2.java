package com.A08_ForLoop_InterviewTopics;

public class A02_ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
	    int n = 1000;
	    // for loop
	    for (int i = 1; i <= n; ++i) {
	      // body inside for loop
	      sum += i;     // sum = sum + i
	      //System.out.println(sum);
	    }
	    System.out.println("Sum = " + sum);
	}

}
