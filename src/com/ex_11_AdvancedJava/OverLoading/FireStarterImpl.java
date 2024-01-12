package com.ex_11_AdvancedJava.OverLoading;

public class FireStarterImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireStarter f= new FireStarter();
		Fuel fuel=new Fuel();
		
		f.ignite(123);
		f.ignite(10);
		f.ignite(fuel, 100);
		f.ignite(fuel, 200, 100);
	}

}
