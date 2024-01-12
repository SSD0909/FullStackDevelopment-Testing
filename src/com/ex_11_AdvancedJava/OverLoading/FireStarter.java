package com.ex_11_AdvancedJava.OverLoading;

public class FireStarter{
	

	public void ignite(double oxygenAmount) {
		
		System.out.println("The oxygen amount is "+oxygenAmount);
		
	}
	
	public void ignite(Fuel fuel, int amount) {
		
		//fuel=fuel;
		System.out.println("The "+fuel.fuelname+" Fuel amount is "+amount);
		
	}
	public void  ignite(Fuel fuel, int amount,double oxygenAmount) {
		
		System.out.println("The "+amount+"Fuel amount is "+fuel.fuelname+"and oxygen amount is"+oxygenAmount);
		
	}
}
