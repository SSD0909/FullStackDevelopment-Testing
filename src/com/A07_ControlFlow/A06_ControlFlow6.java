package com.A07_ControlFlow;

import java.util.Scanner;

public class A06_ControlFlow6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);

System.out.println("Please Enter Your an integer between 1 to 7 ");

int userInput=sc.nextInt();

if(userInput<1||userInput>7) {
	System.out.println("Out of Range");
	
}
else {
switch(userInput) {

case 1:{
	System.out.println("Today is Sunday");
	break;
}
case 2:{
	System.out.println("Today is Monday");
	break;
}
case 3:{
	System.out.println("Today is Tuesday");
	break;
}
case 4:{
	System.out.println("Today is Wednesday");
	break;
}
case 5:{
	System.out.println("Today is Thursday");
	break;
}
case 6:{
	System.out.println("Today is Friday");
	break;
}
	
case 7:{
	System.out.println("Today is Saturday");
		break;
}
default:{
	System.out.println("Not good");
	break;
}	

}


}
sc.close();
	}

}
