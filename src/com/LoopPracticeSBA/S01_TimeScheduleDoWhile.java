package com.LoopPracticeSBA;

import java.util.Scanner;

public class S01_TimeScheduleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char group, response;
Scanner sc= new Scanner(System.in);
System.out.println("***Lab Times***");
do {
System.out.println();
System.out.println("[1] TIME FOR GROUP A");
System.out.println("[2] TIME FOR GROUP B");
System.out.println("[3] TIME FOR GROUP C");
System.out.println("[4] QUIT");
System.out.println("Enter your choice from 1-4 :");
response= sc.next().charAt(0);
System.out.println();
switch(response) {

case '1':
	System.out.println("10.00 A.M");
	break;
	
case '2':System.out.println("1:00P.M");
	break;
case '3':System.out.println("3.00P.M");
	break;
case '4':System.out.println("See you next time");
	break;
	default:System.out.println("Please opt from 1-4");
		
}

}
while(response!='4');//test for quitting
}

}
