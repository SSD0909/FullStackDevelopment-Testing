package com.Objects.ex_01;

import java.util.Scanner;

public class LampImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lamp led= new Lamp();
Lamp halogen=new Lamp();

Scanner sc= new Scanner(System.in);

System.out.println("Please Enter the hours of usage");
int hours=sc.nextInt();


//led.turnOn();
led.turnOn(hours);
sc.close();
halogen.turnOff();
	}

}
