package com.Objects.ex_01;

public class Lamp {

	int hours;
	int dollarsperhour=2;
	boolean isOn;
	
	void turnOn(int hours) {
		
		isOn=true;
		System.out.println("Is the lamp turn on : "+isOn);
		
		hours=hours;
	
		
		double total= hours*dollarsperhour;
		System.out.println("The total dolalr amount of usage is : "+total);
		
	}
/*void turnOn() {
		
		isOn=true;
		System.out.println("Is the lamp turn on : "+isOn);
		
		
		
	}*/
	
void turnOff() {
		
		isOn=false;
		System.out.println("Is the lamp turn on : "+isOn);
	}
}
